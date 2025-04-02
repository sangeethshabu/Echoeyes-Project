//ESP8266

#if defined(ESP32)
#include <WiFi.h>
#elif defined(ESP8266)
#include <ESP8266WiFi.h>
#endif
#include <Firebase_ESP_Client.h>
#include <addons/TokenHelper.h>
#include <addons/RTDBHelper.h>
#include <SPI.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#define WIFI_SSID "GNXS2SF0"
#define WIFI_PASSWORD "200C86B219F0"
#define API_KEY "AIzaSyCI8Dtguz6Rbn1SJ8s92VYpkydu4vprGDc"
#define DATABASE_URL "fir-demoproject2025-default-rtdb.firebaseio.com"
#define USER_EMAIL "jbcproject2020@gmail.com"
#define USER_PASSWORD "Embedded54321"

#define SCREEN_WIDTH 128 // OLED display width, in pixels
#define SCREEN_HEIGHT 64 // OLED display height, in pixels
// Declaration for SSD1306 display connected using I2C
#define OLED_RESET     -1 // Reset pin
#define SCREEN_ADDRESS 0x3C
Adafruit_SSD1306 display(SCREEN_WIDTH, SCREEN_HEIGHT, &Wire, OLED_RESET);
FirebaseData fbdo;
FirebaseAuth auth;
FirebaseConfig config;

int count = 0 ;
String msg;
char txt[50];

void Connect_WiFi();
void Firebase_Store(String PATH,String MSG);
String Firebase_getString(String PATH);

void setup()
{
     Connect_WiFi(); 
     pinMode(2,OUTPUT);// initialize the OLED object
if(!display.begin(SSD1306_SWITCHCAPVCC, SCREEN_ADDRESS)) {
Serial.println(F("SSD1306 allocation failed"));
for(;;); // Don't proceed, loop forever
}
}

void loop()
{     
      int i=0,j=0;
      msg = Firebase_getString("Speech_to_text/text");
      for(i=0;msg[i]!='\0';i++)
      {
        if(msg[i]!= '\\' && msg[i]!= '"')
        {
          txt[j]=msg[i];
          delay(10);
          j++;
        }
      }
      txt[j]='\0';
      display.clearDisplay();
      display.setTextSize(2);
      display.setTextColor(WHITE);
      display.setCursor(0,0);
      display.println(txt);
      display.display();
      delay(2000);
      Serial.println(txt);
      delay(1000);
}
    

void Connect_WiFi()
{
      Serial.begin(9600);
      delay(100); 
      WiFi.disconnect();
      delay(800); 
      Serial.println("Connecting to Wi-Fi"); 
      WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
      Serial.print("Connecting to Wi-Fi");
      delay(100);
      while (WiFi.status() != WL_CONNECTED)
      {
        Serial.print(".");
        delay(300);
      }
      Serial.println();
      Serial.print("Connected with IP: ");
      Serial.println(WiFi.localIP());
      Serial.println();
      Serial.printf("Firebase Client v%s\n\n", FIREBASE_CLIENT_VERSION);
      config.api_key = API_KEY;
      auth.user.email = USER_EMAIL;
      auth.user.password = USER_PASSWORD;
      config.database_url = DATABASE_URL;
      config.token_status_callback = tokenStatusCallback;
      #if defined(ESP8266)
        fbdo.setBSSLBufferSize(2048 /* Rx buffer size in bytes from 512 - 16384 /, 2048 / Tx buffer size in bytes from 512 - 16384 */);
      #endif
      Firebase.begin(&config, &auth);
      Firebase.reconnectWiFi(true);
      Firebase.setDoubleDigits(5);
      config.timeout.serverResponse = 10 * 1000;
}

void Firebase_Store(String PATH,String MSG)
{
      Serial.print("Uploading data \" ");
      Serial.print(MSG);
      Serial.print(" \"  to the location \" ");
      Serial.print(PATH);
      Serial.println(" \"");
      Firebase.RTDB.setString(&fbdo, PATH, MSG);
      delay(50);
}

String Firebase_getString(String PATH)
{
  String msg = (Firebase.RTDB.getString(&fbdo, PATH) ? fbdo.to<const char *>() : fbdo.errorReason().c_str());
  delay(50);
  return msg;
}
