package appinventor.ai_alnefa77.Speech_to_text;

import android.os.Bundle;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.SpeechRecognizer;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.StopBlocksExecution;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

public class Screen1 extends Form implements Runnable {
  static final SimpleSymbol Lit0;
  
  static final SimpleSymbol Lit1;
  
  static final SimpleSymbol Lit10;
  
  static final SimpleSymbol Lit100;
  
  static final FString Lit101;
  
  static final SimpleSymbol Lit102;
  
  static final SimpleSymbol Lit103;
  
  static final SimpleSymbol Lit104;
  
  static final SimpleSymbol Lit105;
  
  static final SimpleSymbol Lit106;
  
  static final SimpleSymbol Lit107;
  
  static final SimpleSymbol Lit108;
  
  static final SimpleSymbol Lit109;
  
  static final SimpleSymbol Lit11;
  
  static final SimpleSymbol Lit110;
  
  static final SimpleSymbol Lit111;
  
  static final SimpleSymbol Lit112;
  
  static final SimpleSymbol Lit113;
  
  static final SimpleSymbol Lit114;
  
  static final SimpleSymbol Lit115 = (SimpleSymbol)(new SimpleSymbol("lookup-handler")).readResolve();
  
  static final SimpleSymbol Lit12;
  
  static final FString Lit13;
  
  static final SimpleSymbol Lit14;
  
  static final SimpleSymbol Lit15;
  
  static final IntNum Lit16;
  
  static final SimpleSymbol Lit17;
  
  static final SimpleSymbol Lit18;
  
  static final IntNum Lit19;
  
  static final SimpleSymbol Lit2;
  
  static final SimpleSymbol Lit20;
  
  static final IntNum Lit21;
  
  static final SimpleSymbol Lit22;
  
  static final IntNum Lit23;
  
  static final SimpleSymbol Lit24;
  
  static final IntNum Lit25;
  
  static final FString Lit26;
  
  static final FString Lit27;
  
  static final SimpleSymbol Lit28;
  
  static final SimpleSymbol Lit29;
  
  static final SimpleSymbol Lit3;
  
  static final IntNum Lit30;
  
  static final SimpleSymbol Lit31;
  
  static final SimpleSymbol Lit32;
  
  static final IntNum Lit33;
  
  static final SimpleSymbol Lit34;
  
  static final FString Lit35;
  
  static final FString Lit36;
  
  static final SimpleSymbol Lit37;
  
  static final IntNum Lit38;
  
  static final FString Lit39;
  
  static final SimpleSymbol Lit4;
  
  static final FString Lit40;
  
  static final SimpleSymbol Lit41;
  
  static final IntNum Lit42;
  
  static final FString Lit43;
  
  static final FString Lit44;
  
  static final SimpleSymbol Lit45;
  
  static final FString Lit46;
  
  static final FString Lit47;
  
  static final SimpleSymbol Lit48;
  
  static final IntNum Lit49;
  
  static final SimpleSymbol Lit5;
  
  static final FString Lit50;
  
  static final FString Lit51;
  
  static final SimpleSymbol Lit52;
  
  static final IntNum Lit53;
  
  static final IntNum Lit54;
  
  static final SimpleSymbol Lit55;
  
  static final IntNum Lit56;
  
  static final IntNum Lit57;
  
  static final FString Lit58;
  
  static final FString Lit59;
  
  static final SimpleSymbol Lit6;
  
  static final SimpleSymbol Lit60;
  
  static final IntNum Lit61;
  
  static final IntNum Lit62;
  
  static final FString Lit63;
  
  static final FString Lit64;
  
  static final SimpleSymbol Lit65;
  
  static final IntNum Lit66;
  
  static final FString Lit67;
  
  static final FString Lit68;
  
  static final SimpleSymbol Lit69;
  
  static final SimpleSymbol Lit7;
  
  static final SimpleSymbol Lit70;
  
  static final SimpleSymbol Lit71;
  
  static final IntNum Lit72;
  
  static final FString Lit73;
  
  static final SimpleSymbol Lit74;
  
  static final SimpleSymbol Lit75;
  
  static final SimpleSymbol Lit76;
  
  static final SimpleSymbol Lit77;
  
  static final FString Lit78;
  
  static final SimpleSymbol Lit79;
  
  static final SimpleSymbol Lit8;
  
  static final IntNum Lit80;
  
  static final FString Lit81;
  
  static final FString Lit82;
  
  static final SimpleSymbol Lit83;
  
  static final IntNum Lit84;
  
  static final FString Lit85;
  
  static final FString Lit86;
  
  static final SimpleSymbol Lit87;
  
  static final FString Lit88;
  
  static final SimpleSymbol Lit89;
  
  static final SimpleSymbol Lit9;
  
  static final SimpleSymbol Lit90;
  
  static final SimpleSymbol Lit91;
  
  static final PairWithPosition Lit92;
  
  static final SimpleSymbol Lit93;
  
  static final SimpleSymbol Lit94;
  
  static final FString Lit95;
  
  static final SimpleSymbol Lit96;
  
  static final SimpleSymbol Lit97;
  
  static final SimpleSymbol Lit98;
  
  static final SimpleSymbol Lit99;
  
  public static Screen1 Screen1;
  
  static final ModuleMethod lambda$Fn1;
  
  static final ModuleMethod lambda$Fn10;
  
  static final ModuleMethod lambda$Fn11;
  
  static final ModuleMethod lambda$Fn12;
  
  static final ModuleMethod lambda$Fn13;
  
  static final ModuleMethod lambda$Fn14;
  
  static final ModuleMethod lambda$Fn15;
  
  static final ModuleMethod lambda$Fn16;
  
  static final ModuleMethod lambda$Fn17;
  
  static final ModuleMethod lambda$Fn18;
  
  static final ModuleMethod lambda$Fn19;
  
  static final ModuleMethod lambda$Fn2;
  
  static final ModuleMethod lambda$Fn20;
  
  static final ModuleMethod lambda$Fn21;
  
  static final ModuleMethod lambda$Fn22;
  
  static final ModuleMethod lambda$Fn23;
  
  static final ModuleMethod lambda$Fn24;
  
  static final ModuleMethod lambda$Fn25;
  
  static final ModuleMethod lambda$Fn26;
  
  static final ModuleMethod lambda$Fn27;
  
  static final ModuleMethod lambda$Fn28;
  
  static final ModuleMethod lambda$Fn29;
  
  static final ModuleMethod lambda$Fn3;
  
  static final ModuleMethod lambda$Fn30;
  
  static final ModuleMethod lambda$Fn4;
  
  static final ModuleMethod lambda$Fn5;
  
  static final ModuleMethod lambda$Fn6;
  
  static final ModuleMethod lambda$Fn7;
  
  static final ModuleMethod lambda$Fn8;
  
  static final ModuleMethod lambda$Fn9;
  
  public Boolean $Stdebug$Mnform$St;
  
  public final ModuleMethod $define;
  
  public Button Button4;
  
  public final ModuleMethod Button4$Click;
  
  public FirebaseDB FirebaseDB1;
  
  public HorizontalArrangement HorizontalArrangement1;
  
  public HorizontalArrangement HorizontalArrangement10;
  
  public HorizontalArrangement HorizontalArrangement11;
  
  public HorizontalArrangement HorizontalArrangement5;
  
  public HorizontalArrangement HorizontalArrangement6;
  
  public HorizontalArrangement HorizontalArrangement7;
  
  public HorizontalArrangement HorizontalArrangement8;
  
  public HorizontalArrangement HorizontalArrangement9;
  
  public Label Label1;
  
  public Label Label8;
  
  public Label Label9;
  
  public SpeechRecognizer SpeechRecognizer1;
  
  public final ModuleMethod SpeechRecognizer1$AfterGettingText;
  
  public final ModuleMethod add$Mnto$Mncomponents;
  
  public final ModuleMethod add$Mnto$Mnevents;
  
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  
  public final ModuleMethod android$Mnlog$Mnform;
  
  public LList components$Mnto$Mncreate;
  
  public final ModuleMethod dispatchEvent;
  
  public final ModuleMethod dispatchGenericEvent;
  
  public LList events$Mnto$Mnregister;
  
  public LList form$Mndo$Mnafter$Mncreation;
  
  public Environment form$Mnenvironment;
  
  public Symbol form$Mnname$Mnsymbol;
  
  public final ModuleMethod get$Mnsimple$Mnname;
  
  public Environment global$Mnvar$Mnenvironment;
  
  public LList global$Mnvars$Mnto$Mncreate;
  
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  
  public final ModuleMethod lookup$Mnhandler;
  
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  
  public final ModuleMethod onCreate;
  
  public final ModuleMethod process$Mnexception;
  
  public final ModuleMethod send$Mnerror;
  
  static {
    Lit114 = (SimpleSymbol)(new SimpleSymbol("dispatchGenericEvent")).readResolve();
    Lit113 = (SimpleSymbol)(new SimpleSymbol("dispatchEvent")).readResolve();
    Lit112 = (SimpleSymbol)(new SimpleSymbol("send-error")).readResolve();
    Lit111 = (SimpleSymbol)(new SimpleSymbol("add-to-form-do-after-creation")).readResolve();
    Lit110 = (SimpleSymbol)(new SimpleSymbol("add-to-global-vars")).readResolve();
    Lit109 = (SimpleSymbol)(new SimpleSymbol("add-to-components")).readResolve();
    Lit108 = (SimpleSymbol)(new SimpleSymbol("add-to-events")).readResolve();
    Lit107 = (SimpleSymbol)(new SimpleSymbol("add-to-global-var-environment")).readResolve();
    Lit106 = (SimpleSymbol)(new SimpleSymbol("is-bound-in-form-environment")).readResolve();
    Lit105 = (SimpleSymbol)(new SimpleSymbol("lookup-in-form-environment")).readResolve();
    Lit104 = (SimpleSymbol)(new SimpleSymbol("add-to-form-environment")).readResolve();
    Lit103 = (SimpleSymbol)(new SimpleSymbol("android-log-form")).readResolve();
    Lit102 = (SimpleSymbol)(new SimpleSymbol("get-simple-name")).readResolve();
    Lit101 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit100 = (SimpleSymbol)(new SimpleSymbol("ProjectBucket")).readResolve();
    Lit99 = (SimpleSymbol)(new SimpleSymbol("FirebaseURL")).readResolve();
    Lit98 = (SimpleSymbol)(new SimpleSymbol("FirebaseToken")).readResolve();
    Lit97 = (SimpleSymbol)(new SimpleSymbol("DeveloperBucket")).readResolve();
    Lit96 = (SimpleSymbol)(new SimpleSymbol("DefaultURL")).readResolve();
    Lit95 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit94 = (SimpleSymbol)(new SimpleSymbol("AfterGettingText")).readResolve();
    Lit93 = (SimpleSymbol)(new SimpleSymbol("SpeechRecognizer1$AfterGettingText")).readResolve();
    SimpleSymbol simpleSymbol = (SimpleSymbol)(new SimpleSymbol("text")).readResolve();
    Lit6 = simpleSymbol;
    Lit92 = PairWithPosition.make(simpleSymbol, PairWithPosition.make((new SimpleSymbol("any")).readResolve(), LList.Empty, "/tmp/1738745847833_4283828654746343424-0/youngandroidproject/../src/appinventor/ai_alnefa77/Speech_to_text/Screen1.yail", 712910), "/tmp/1738745847833_4283828654746343424-0/youngandroidproject/../src/appinventor/ai_alnefa77/Speech_to_text/Screen1.yail", 712904);
    Lit91 = (SimpleSymbol)(new SimpleSymbol("StoreValue")).readResolve();
    Lit90 = (SimpleSymbol)(new SimpleSymbol("FirebaseDB1")).readResolve();
    Lit89 = (SimpleSymbol)(new SimpleSymbol("Result")).readResolve();
    Lit88 = new FString("com.google.appinventor.components.runtime.SpeechRecognizer");
    Lit87 = (SimpleSymbol)(new SimpleSymbol("UseLegacy")).readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.SpeechRecognizer");
    Lit85 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit84 = IntNum.make(16777215);
    Lit83 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement11")).readResolve();
    Lit82 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit80 = IntNum.make(16777215);
    Lit79 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement10")).readResolve();
    Lit78 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit77 = (SimpleSymbol)(new SimpleSymbol("Click")).readResolve();
    Lit76 = (SimpleSymbol)(new SimpleSymbol("Button4$Click")).readResolve();
    Lit75 = (SimpleSymbol)(new SimpleSymbol("GetText")).readResolve();
    Lit74 = (SimpleSymbol)(new SimpleSymbol("SpeechRecognizer1")).readResolve();
    Lit73 = new FString("com.google.appinventor.components.runtime.Button");
    Lit72 = IntNum.make(1);
    Lit71 = (SimpleSymbol)(new SimpleSymbol("Shape")).readResolve();
    Lit70 = (SimpleSymbol)(new SimpleSymbol("Image")).readResolve();
    Lit69 = (SimpleSymbol)(new SimpleSymbol("Button4")).readResolve();
    Lit68 = new FString("com.google.appinventor.components.runtime.Button");
    Lit67 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit66 = IntNum.make(16777215);
    Lit65 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement5")).readResolve();
    Lit64 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit63 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit62 = IntNum.make(20);
    Lit61 = IntNum.make(16777215);
    Lit60 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement8")).readResolve();
    Lit59 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit58 = new FString("com.google.appinventor.components.runtime.Label");
    Lit57 = IntNum.make(-1080);
    Lit56 = IntNum.make(100);
    Lit55 = (SimpleSymbol)(new SimpleSymbol("FontTypeface")).readResolve();
    Lit54 = IntNum.make(18);
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = -738197505;
    Lit53 = IntNum.make(arrayOfInt);
    Lit52 = (SimpleSymbol)(new SimpleSymbol("Label8")).readResolve();
    Lit51 = new FString("com.google.appinventor.components.runtime.Label");
    Lit50 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit49 = IntNum.make(16777215);
    Lit48 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement6")).readResolve();
    Lit47 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    Lit45 = (SimpleSymbol)(new SimpleSymbol("Label9")).readResolve();
    Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit42 = IntNum.make(16777215);
    Lit41 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement7")).readResolve();
    Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit39 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit38 = IntNum.make(16777215);
    Lit37 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement9")).readResolve();
    Lit36 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit35 = new FString("com.google.appinventor.components.runtime.Label");
    Lit34 = (SimpleSymbol)(new SimpleSymbol("Visible")).readResolve();
    arrayOfInt = new int[2];
    arrayOfInt[0] = -62228;
    Lit33 = IntNum.make(arrayOfInt);
    Lit32 = (SimpleSymbol)(new SimpleSymbol("TextColor")).readResolve();
    Lit31 = (SimpleSymbol)(new SimpleSymbol("Text")).readResolve();
    Lit30 = IntNum.make(30);
    Lit29 = (SimpleSymbol)(new SimpleSymbol("FontSize")).readResolve();
    Lit28 = (SimpleSymbol)(new SimpleSymbol("Label1")).readResolve();
    Lit27 = new FString("com.google.appinventor.components.runtime.Label");
    Lit26 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit25 = IntNum.make(-2);
    Lit24 = (SimpleSymbol)(new SimpleSymbol("Width")).readResolve();
    Lit23 = IntNum.make(50);
    Lit22 = (SimpleSymbol)(new SimpleSymbol("Height")).readResolve();
    Lit21 = IntNum.make(16777215);
    Lit20 = (SimpleSymbol)(new SimpleSymbol("BackgroundColor")).readResolve();
    Lit19 = IntNum.make(2);
    Lit18 = (SimpleSymbol)(new SimpleSymbol("AlignVertical")).readResolve();
    Lit17 = (SimpleSymbol)(new SimpleSymbol("number")).readResolve();
    Lit16 = IntNum.make(3);
    Lit15 = (SimpleSymbol)(new SimpleSymbol("AlignHorizontal")).readResolve();
    Lit14 = (SimpleSymbol)(new SimpleSymbol("HorizontalArrangement1")).readResolve();
    Lit13 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit12 = (SimpleSymbol)(new SimpleSymbol("TitleVisible")).readResolve();
    Lit11 = (SimpleSymbol)(new SimpleSymbol("Title")).readResolve();
    Lit10 = (SimpleSymbol)(new SimpleSymbol("Sizing")).readResolve();
    Lit9 = (SimpleSymbol)(new SimpleSymbol("ShowListsAsJson")).readResolve();
    Lit8 = (SimpleSymbol)(new SimpleSymbol("ScreenOrientation")).readResolve();
    Lit7 = (SimpleSymbol)(new SimpleSymbol("BackgroundImage")).readResolve();
    Lit5 = (SimpleSymbol)(new SimpleSymbol("AppName")).readResolve();
    Lit4 = (SimpleSymbol)(new SimpleSymbol("boolean")).readResolve();
    Lit3 = (SimpleSymbol)(new SimpleSymbol("ActionBar")).readResolve();
    Lit2 = (SimpleSymbol)(new SimpleSymbol("the-null-value")).readResolve();
    Lit1 = (SimpleSymbol)(new SimpleSymbol("getMessage")).readResolve();
    Lit0 = (SimpleSymbol)(new SimpleSymbol("Screen1")).readResolve();
  }
  
  public Screen1() {
    ModuleInfo.register(this);
    Screen1$frame screen1$frame = new Screen1$frame();
    screen1$frame.$main = this;
    this.get$Mnsimple$Mnname = new ModuleMethod(screen1$frame, 1, Lit102, 4097);
    this.onCreate = new ModuleMethod(screen1$frame, 2, "onCreate", 4097);
    this.android$Mnlog$Mnform = new ModuleMethod(screen1$frame, 3, Lit103, 4097);
    this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 4, Lit104, 8194);
    this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 5, Lit105, 8193);
    this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(screen1$frame, 7, Lit106, 4097);
    this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(screen1$frame, 8, Lit107, 8194);
    this.add$Mnto$Mnevents = new ModuleMethod(screen1$frame, 9, Lit108, 8194);
    this.add$Mnto$Mncomponents = new ModuleMethod(screen1$frame, 10, Lit109, 16388);
    this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(screen1$frame, 11, Lit110, 8194);
    this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(screen1$frame, 12, Lit111, 4097);
    this.send$Mnerror = new ModuleMethod(screen1$frame, 13, Lit112, 4097);
    this.process$Mnexception = new ModuleMethod(screen1$frame, 14, "process-exception", 4097);
    this.dispatchEvent = new ModuleMethod(screen1$frame, 15, Lit113, 16388);
    this.dispatchGenericEvent = new ModuleMethod(screen1$frame, 16, Lit114, 16388);
    this.lookup$Mnhandler = new ModuleMethod(screen1$frame, 17, Lit115, 8194);
    ModuleMethod moduleMethod = new ModuleMethod(screen1$frame, 18, null, 0);
    moduleMethod.setProperty("source-location", "/tmp/runtime7559528541951036490.scm:634");
    lambda$Fn1 = moduleMethod;
    this.$define = new ModuleMethod(screen1$frame, 19, "$define", 0);
    lambda$Fn2 = new ModuleMethod(screen1$frame, 20, null, 0);
    lambda$Fn3 = new ModuleMethod(screen1$frame, 21, null, 0);
    lambda$Fn4 = new ModuleMethod(screen1$frame, 22, null, 0);
    lambda$Fn5 = new ModuleMethod(screen1$frame, 23, null, 0);
    lambda$Fn6 = new ModuleMethod(screen1$frame, 24, null, 0);
    lambda$Fn7 = new ModuleMethod(screen1$frame, 25, null, 0);
    lambda$Fn8 = new ModuleMethod(screen1$frame, 26, null, 0);
    lambda$Fn9 = new ModuleMethod(screen1$frame, 27, null, 0);
    lambda$Fn10 = new ModuleMethod(screen1$frame, 28, null, 0);
    lambda$Fn11 = new ModuleMethod(screen1$frame, 29, null, 0);
    lambda$Fn12 = new ModuleMethod(screen1$frame, 30, null, 0);
    lambda$Fn13 = new ModuleMethod(screen1$frame, 31, null, 0);
    lambda$Fn14 = new ModuleMethod(screen1$frame, 32, null, 0);
    lambda$Fn15 = new ModuleMethod(screen1$frame, 33, null, 0);
    lambda$Fn16 = new ModuleMethod(screen1$frame, 34, null, 0);
    lambda$Fn17 = new ModuleMethod(screen1$frame, 35, null, 0);
    lambda$Fn18 = new ModuleMethod(screen1$frame, 36, null, 0);
    lambda$Fn19 = new ModuleMethod(screen1$frame, 37, null, 0);
    lambda$Fn20 = new ModuleMethod(screen1$frame, 38, null, 0);
    lambda$Fn21 = new ModuleMethod(screen1$frame, 39, null, 0);
    lambda$Fn22 = new ModuleMethod(screen1$frame, 40, null, 0);
    this.Button4$Click = new ModuleMethod(screen1$frame, 41, Lit76, 0);
    lambda$Fn23 = new ModuleMethod(screen1$frame, 42, null, 0);
    lambda$Fn24 = new ModuleMethod(screen1$frame, 43, null, 0);
    lambda$Fn25 = new ModuleMethod(screen1$frame, 44, null, 0);
    lambda$Fn26 = new ModuleMethod(screen1$frame, 45, null, 0);
    lambda$Fn27 = new ModuleMethod(screen1$frame, 46, null, 0);
    lambda$Fn28 = new ModuleMethod(screen1$frame, 47, null, 0);
    this.SpeechRecognizer1$AfterGettingText = new ModuleMethod(screen1$frame, 48, Lit93, 8194);
    lambda$Fn29 = new ModuleMethod(screen1$frame, 49, null, 0);
    lambda$Fn30 = new ModuleMethod(screen1$frame, 50, null, 0);
  }
  
  static Object lambda10() {
    SimpleSymbol simpleSymbol1 = Lit41;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit42;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit30, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda11() {
    SimpleSymbol simpleSymbol1 = Lit41;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit42;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit30, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda12() {
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit24, Lit25, Lit17);
  }
  
  static Object lambda13() {
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit24, Lit25, Lit17);
  }
  
  static Object lambda14() {
    SimpleSymbol simpleSymbol1 = Lit48;
    SimpleSymbol simpleSymbol2 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit49, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda15() {
    SimpleSymbol simpleSymbol1 = Lit48;
    SimpleSymbol simpleSymbol2 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit49, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda16() {
    SimpleSymbol simpleSymbol1 = Lit52;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit53;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit29, Lit54, simpleSymbol2);
    simpleSymbol3 = Lit55;
    SimpleSymbol simpleSymbol4 = Lit6;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, "3", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit56, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit31, "  speak...", simpleSymbol4);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit57, simpleSymbol2);
  }
  
  static Object lambda17() {
    SimpleSymbol simpleSymbol1 = Lit52;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit53;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit29, Lit54, simpleSymbol2);
    simpleSymbol3 = Lit55;
    SimpleSymbol simpleSymbol4 = Lit6;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, "3", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit56, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit31, "  speak...", simpleSymbol4);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit57, simpleSymbol2);
  }
  
  static Object lambda18() {
    SimpleSymbol simpleSymbol1 = Lit60;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit61;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit62, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda19() {
    SimpleSymbol simpleSymbol1 = Lit60;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit61;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit62, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject) {
    LList lList2 = LList.makeList(paramArrayOfObject, 0);
    Apply apply = Scheme.apply;
    ModuleMethod moduleMethod = strings.string$Mnappend;
    LList lList1 = LList.Empty;
    while (true) {
      Object object1;
      Object object2;
      if (lList2 == LList.Empty) {
        object1 = apply.apply2(moduleMethod, LList.reverseInPlace(lList1));
        try {
          CharSequence charSequence = (CharSequence)object1;
          return misc.string$To$Symbol(charSequence);
        } catch (ClassCastException null) {
          throw new WrongType(object2, "string->symbol", 1, object1);
        } 
      } 
      try {
        Pair pair = (Pair)object2;
        object2 = pair.getCdr();
        Object object = pair.getCar();
        try {
          Symbol symbol = (Symbol)object;
          object1 = Pair.make(misc.symbol$To$String(symbol), object1);
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "symbol->string", 1, object);
        } 
      } catch (ClassCastException classCastException) {
        WrongType wrongType = new WrongType(classCastException, "arg0", -2, object2);
        throw wrongType;
      } 
    } 
  }
  
  static Object lambda2() {
    return null;
  }
  
  static Object lambda20() {
    SimpleSymbol simpleSymbol1 = Lit65;
    SimpleSymbol simpleSymbol3 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit66, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  static Object lambda21() {
    SimpleSymbol simpleSymbol1 = Lit65;
    SimpleSymbol simpleSymbol3 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit66, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  static Object lambda22() {
    SimpleSymbol simpleSymbol1 = Lit69;
    SimpleSymbol simpleSymbol2 = Lit22;
    IntNum intNum = Lit23;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit70, "voice.png", Lit6);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit71, Lit72, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol3);
  }
  
  static Object lambda23() {
    SimpleSymbol simpleSymbol1 = Lit69;
    SimpleSymbol simpleSymbol2 = Lit22;
    IntNum intNum = Lit23;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit70, "voice.png", Lit6);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit71, Lit72, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol3);
  }
  
  static Object lambda24() {
    SimpleSymbol simpleSymbol1 = Lit79;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit80;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  static Object lambda25() {
    SimpleSymbol simpleSymbol1 = Lit79;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit80;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  static Object lambda26() {
    SimpleSymbol simpleSymbol1 = Lit83;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit84;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit23, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda27() {
    SimpleSymbol simpleSymbol1 = Lit83;
    SimpleSymbol simpleSymbol2 = Lit20;
    IntNum intNum = Lit84;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit23, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda28() {
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit87, Boolean.FALSE, Lit4);
  }
  
  static Object lambda29() {
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit87, Boolean.FALSE, Lit4);
  }
  
  static Object lambda3() {
    SimpleSymbol simpleSymbol1 = Lit0;
    SimpleSymbol simpleSymbol3 = Lit3;
    Boolean bool = Boolean.TRUE;
    SimpleSymbol simpleSymbol2 = Lit4;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, bool, simpleSymbol2);
    simpleSymbol3 = Lit5;
    SimpleSymbol simpleSymbol4 = Lit6;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, "Speech_to_text", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit7, "musical-notes-frame-with-text-space_1017-32857.avif", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit8, "unspecified", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit9, Boolean.TRUE, simpleSymbol2);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit10, "Responsive", simpleSymbol4);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit11, "Screen1", simpleSymbol4);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit12, Boolean.FALSE, simpleSymbol2);
  }
  
  static Object lambda30() {
    SimpleSymbol simpleSymbol1 = Lit90;
    SimpleSymbol simpleSymbol2 = Lit96;
    SimpleSymbol simpleSymbol3 = Lit6;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, "https://dazzling-fire-7140.firebaseio.com/", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit97, "alnefa77@gmail:com/", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit98, "ntwxsaqzGuAG5Y17qvKMJPHQKummG0QMluydPZFP", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit99, "https://fir-demoproject2025-default-rtdb.firebaseio.com/", simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit100, "Speech_to_text", simpleSymbol3);
  }
  
  static Object lambda31() {
    SimpleSymbol simpleSymbol1 = Lit90;
    SimpleSymbol simpleSymbol2 = Lit96;
    SimpleSymbol simpleSymbol3 = Lit6;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, "https://dazzling-fire-7140.firebaseio.com/", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit97, "alnefa77@gmail:com/", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit98, "ntwxsaqzGuAG5Y17qvKMJPHQKummG0QMluydPZFP", simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit99, "https://fir-demoproject2025-default-rtdb.firebaseio.com/", simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit100, "Speech_to_text", simpleSymbol3);
  }
  
  static Object lambda4() {
    SimpleSymbol simpleSymbol1 = Lit14;
    SimpleSymbol simpleSymbol2 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit18, Lit19, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit21, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit23, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda5() {
    SimpleSymbol simpleSymbol1 = Lit14;
    SimpleSymbol simpleSymbol2 = Lit15;
    IntNum intNum = Lit16;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit18, Lit19, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit20, Lit21, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit22, Lit23, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, Lit25, simpleSymbol3);
  }
  
  static Object lambda6() {
    SimpleSymbol simpleSymbol1 = Lit28;
    SimpleSymbol simpleSymbol2 = Lit29;
    IntNum intNum = Lit30;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit31, "Speak to text", Lit6);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit32, Lit33, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit34, Boolean.FALSE, Lit4);
  }
  
  static Object lambda7() {
    SimpleSymbol simpleSymbol1 = Lit28;
    SimpleSymbol simpleSymbol2 = Lit29;
    IntNum intNum = Lit30;
    SimpleSymbol simpleSymbol3 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol2, intNum, simpleSymbol3);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit31, "Speak to text", Lit6);
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit32, Lit33, simpleSymbol3);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit34, Boolean.FALSE, Lit4);
  }
  
  static Object lambda8() {
    SimpleSymbol simpleSymbol1 = Lit37;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit38;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  static Object lambda9() {
    SimpleSymbol simpleSymbol1 = Lit37;
    SimpleSymbol simpleSymbol3 = Lit20;
    IntNum intNum = Lit38;
    SimpleSymbol simpleSymbol2 = Lit17;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    simpleSymbol3 = Lit22;
    intNum = Lit25;
    runtime.setAndCoerceProperty$Ex(simpleSymbol1, simpleSymbol3, intNum, simpleSymbol2);
    return runtime.setAndCoerceProperty$Ex(simpleSymbol1, Lit24, intNum, simpleSymbol2);
  }
  
  public void $define() {
    Language.setDefaults((Language)Scheme.getInstance());
    try {
      run();
    } catch (Exception exception) {
      androidLogForm(exception.getMessage());
      processException(exception);
    } 
    Screen1 = this;
    addToFormEnvironment((Symbol)Lit0, this);
    LList lList1 = this.events$Mnto$Mnregister;
    LList lList2 = lList1;
    while (true) {
      Object object;
      if (lList1 == LList.Empty) {
        try {
          lList1 = lists.reverse(this.components$Mnto$Mncreate);
          lList2 = lList1;
          addToGlobalVars(Lit2, lambda$Fn1);
          lList2 = lList1;
          LList lList = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
          while (true) {
            lList2 = lList1;
            if (lList == LList.Empty) {
              lList = null;
              LList lList3 = lList1;
              while (true) {
                lList2 = lList1;
                if (lList3 == LList.Empty) {
                  lList2 = lList1;
                  lList3 = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
                  while (true) {
                    lList2 = lList1;
                    if (lList3 == LList.Empty) {
                      lList3 = lList1;
                      while (true) {
                        lList2 = lList1;
                        if (lList3 == LList.Empty) {
                          lList2 = lList1;
                          lList3 = lList;
                          lList = lList2;
                          while (true) {
                            lList2 = lList1;
                            lList2 = LList.Empty;
                            if (lList == lList2)
                              return; 
                            lList2 = lList1;
                            try {
                              Pair pair = (Pair)lList;
                              lList2 = lList1;
                              object1 = pair.getCar();
                              lList2 = lList1;
                              object2 = lists.caddr.apply1(object1);
                              lList2 = lList1;
                              lists.cadddr.apply1(object1);
                              lList2 = lList1;
                              callInitialize(SlotGet.field.apply2(this, object2));
                              lList2 = lList1;
                              object1 = pair.getCdr();
                            } catch (ClassCastException object2) {
                              lList2 = lList1;
                              object1 = new WrongType((ClassCastException)object2, "arg0", -2, object1);
                              lList2 = lList1;
                              throw object1;
                            } 
                          } 
                          break;
                        } 
                        lList2 = lList1;
                        try {
                          Pair pair = (Pair)object2;
                          lList2 = lList1;
                          object1 = pair.getCar();
                          lList2 = lList1;
                          lists.caddr.apply1(object1);
                          lList2 = lList1;
                          object1 = lists.cadddr.apply1(object1);
                          lList2 = lList1;
                          if (object1 != Boolean.FALSE) {
                            lList2 = lList1;
                            Scheme.applyToArgs.apply1(object1);
                          } 
                          lList2 = lList1;
                          object2 = pair.getCdr();
                        } catch (ClassCastException classCastException) {
                          lList2 = lList1;
                          object1 = new WrongType(classCastException, "arg0", -2, object2);
                          continue;
                        } 
                      } 
                      break;
                    } 
                    lList2 = lList1;
                    try {
                      Pair pair = (Pair)object2;
                      lList2 = lList1;
                      object1 = pair.getCar();
                      lList2 = lList1;
                      object2 = lists.car.apply1(object1);
                      lList2 = lList1;
                      Object object3 = lists.cadr.apply1(object1);
                      lList2 = lList1;
                      try {
                        Symbol symbol = (Symbol)object2;
                        lList2 = lList1;
                        addToGlobalVarEnvironment(symbol, Scheme.applyToArgs.apply1(object3));
                        lList2 = lList1;
                        object2 = pair.getCdr();
                      } catch (ClassCastException classCastException) {
                        lList2 = lList1;
                        throw new WrongType(classCastException, "add-to-global-var-environment", 0, object2);
                      } 
                    } catch (ClassCastException null) {
                      lList2 = lList1;
                      throw new WrongType(object1, "arg0", -2, object2);
                    } 
                  } 
                  break;
                } 
                lList2 = lList1;
                try {
                  Pair pair = (Pair)object2;
                  lList2 = lList1;
                  object1 = pair.getCar();
                  lList2 = lList1;
                  object2 = lists.caddr.apply1(object1);
                  lList2 = lList1;
                  lists.cadddr.apply1(object1);
                  lList2 = lList1;
                  Object object3 = lists.cadr.apply1(object1);
                  lList2 = lList1;
                  Object object4 = lists.car.apply1(object1);
                  lList2 = lList1;
                  try {
                    Symbol symbol = (Symbol)object4;
                    lList2 = lList1;
                    object4 = lookupInFormEnvironment(symbol);
                    lList2 = lList1;
                    object3 = Invoke.make.apply2(object3, object4);
                    lList2 = lList1;
                    SlotSet.set$Mnfield$Ex.apply3(this, object2, object3);
                    lList2 = lList1;
                    try {
                      object4 = object2;
                      lList2 = lList1;
                      addToFormEnvironment((Symbol)object4, object3);
                      lList2 = lList1;
                      object2 = pair.getCdr();
                    } catch (ClassCastException classCastException) {
                      lList2 = lList1;
                      throw new WrongType(classCastException, "add-to-form-environment", 0, object2);
                    } 
                  } catch (ClassCastException classCastException) {
                    lList2 = lList1;
                    throw new WrongType(classCastException, "lookup-in-form-environment", 0, object4);
                  } 
                } catch (ClassCastException object1) {
                  lList2 = lList1;
                  throw new WrongType(object1, "arg0", -2, object2);
                } 
              } 
              break;
            } 
            lList2 = lList1;
            try {
              Pair pair = (Pair)object1;
              lList2 = lList1;
              misc.force(pair.getCar());
              lList2 = lList1;
              object1 = pair.getCdr();
            } catch (ClassCastException classCastException) {
              lList2 = lList1;
              throw new WrongType(classCastException, "arg0", -2, object1);
            } 
          } 
        } catch (YailRuntimeError null) {
          processException(object);
          return;
        } 
        break;
      } 
      try {
        Pair pair = (Pair)object;
        Object object1 = pair.getCar();
        object = lists.car.apply1(object1);
        String str = null;
        if (object == null) {
          object = null;
        } else {
          object = object.toString();
        } 
        object1 = lists.cdr.apply1(object1);
        if (object1 != null)
          str = object1.toString(); 
        EventDispatcher.registerEventForDelegation((HandlesEventDispatching)this, (String)object, str);
        object = pair.getCdr();
      } catch (ClassCastException classCastException) {
        object = new WrongType(classCastException, "arg0", -2, object);
        throw object;
      } 
    } 
  }
  
  public Object Button4$Click() {
    runtime.setThisForm();
    return runtime.callComponentMethod(Lit74, Lit75, LList.Empty, LList.Empty);
  }
  
  public Object SpeechRecognizer1$AfterGettingText(Object paramObject1, Object paramObject2) {
    runtime.sanitizeComponentData(paramObject1);
    runtime.sanitizeComponentData(paramObject2);
    runtime.setThisForm();
    paramObject1 = Lit52;
    paramObject2 = Lit31;
    runtime.setAndCoerceProperty$Ex(paramObject1, paramObject2, runtime.getProperty$1(Lit74, Lit89), Lit6);
    return runtime.callComponentMethod(Lit90, Lit91, LList.list2("text", runtime.getProperty$1(paramObject1, paramObject2)), Lit92);
  }
  
  public void addToComponents(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    this.components$Mnto$Mncreate = (LList)lists.cons(LList.list4(paramObject1, paramObject2, paramObject3, paramObject4), this.components$Mnto$Mncreate);
  }
  
  public void addToEvents(Object paramObject1, Object paramObject2) {
    this.events$Mnto$Mnregister = (LList)lists.cons(lists.cons(paramObject1, paramObject2), this.events$Mnto$Mnregister);
  }
  
  public void addToFormDoAfterCreation(Object paramObject) {
    this.form$Mndo$Mnafter$Mncreation = (LList)lists.cons(paramObject, this.form$Mndo$Mnafter$Mncreation);
  }
  
  public void addToFormEnvironment(Symbol paramSymbol, Object paramObject) {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.form$Mnenvironment, paramObject }));
    this.form$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVarEnvironment(Symbol paramSymbol, Object paramObject) {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, this.global$Mnvar$Mnenvironment, paramObject }));
    this.global$Mnvar$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVars(Object paramObject1, Object paramObject2) {
    this.global$Mnvars$Mnto$Mncreate = (LList)lists.cons(LList.list2(paramObject1, paramObject2), this.global$Mnvars$Mnto$Mncreate);
  }
  
  public void androidLogForm(Object paramObject) {}
  
  public boolean dispatchEvent(Component paramComponent, String paramString1, String paramString2, Object[] paramArrayOfObject) {
    SimpleSymbol simpleSymbol = misc.string$To$Symbol(paramString1);
    boolean bool1 = isBoundInFormEnvironment((Symbol)simpleSymbol);
    boolean bool = false;
    if (bool1) {
      if (lookupInFormEnvironment((Symbol)simpleSymbol) == paramComponent) {
        object = lookupHandler(paramString1, paramString2);
        boolean bool2 = true;
        try {
        
        } catch (StopBlocksExecution stopBlocksExecution) {
        
        } catch (PermissionException object) {
        
        } finally {
          stopBlocksExecution = null;
          androidLogForm(stopBlocksExecution.getMessage());
          stopBlocksExecution.printStackTrace();
        } 
        return bool;
      } 
      return false;
    } 
    EventDispatcher.unregisterEventForDelegation((HandlesEventDispatching)this, (String)object, paramString2);
    return false;
  }
  
  public void dispatchGenericEvent(Component paramComponent, String paramString, boolean paramBoolean, Object[] paramArrayOfObject) {
    boolean bool = false;
    Object object = lookupInFormEnvironment((Symbol)misc.string$To$Symbol((CharSequence)strings.stringAppend(new Object[] { "any$", getSimpleName(paramComponent), "$", paramString })));
    if (object != Boolean.FALSE)
      try {
      
      } catch (StopBlocksExecution stopBlocksExecution) {
      
      } catch (PermissionException permissionException) {
      
      } finally {
        stopBlocksExecution = null;
        androidLogForm(stopBlocksExecution.getMessage());
        stopBlocksExecution.printStackTrace();
      }  
  }
  
  public String getSimpleName(Object paramObject) {
    return paramObject.getClass().getSimpleName();
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol) {
    return this.form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object lookupHandler(Object paramObject1, Object paramObject2) {
    Object object = null;
    if (paramObject1 == null) {
      paramObject1 = null;
    } else {
      paramObject1 = paramObject1.toString();
    } 
    if (paramObject2 == null) {
      paramObject2 = object;
    } else {
      paramObject2 = paramObject2.toString();
    } 
    return lookupInFormEnvironment((Symbol)misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol) {
    return lookupInFormEnvironment(paramSymbol, Boolean.FALSE);
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol, Object paramObject) {
    Environment environment = this.form$Mnenvironment;
    if (environment == null) {
      i = 1;
    } else {
      i = 0;
    } 
    int i = 0x1 & i + 1;
    return ((i != 0) ? environment.isBound(paramSymbol) : (i != 0)) ? this.form$Mnenvironment.get(paramSymbol) : paramObject;
  }
  
  public void onCreate(Bundle paramBundle) {
    AppInventorCompatActivity.setClassicModeFromYail(false);
    super.onCreate(paramBundle);
  }
  
  public void processException(Object paramObject) {
    Object object = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(paramObject, Lit1));
    if (object == null) {
      object = null;
    } else {
      object = object.toString();
    } 
    if (paramObject instanceof YailRuntimeError) {
      paramObject = ((YailRuntimeError)paramObject).getErrorType();
    } else {
      paramObject = "Runtime Error";
    } 
    RuntimeErrorAlert.alert(this, (String)object, (String)paramObject, "End Application");
  }
  
  public void run() {
    Exception exception;
    CallContext callContext = CallContext.getInstance();
    Consumer consumer = callContext.consumer;
    callContext.consumer = (Consumer)VoidConsumer.instance;
    try {
      run(callContext);
      exception = null;
    } finally {}
    ModuleBody.runCleanup(callContext, exception, consumer);
  }
  
  public final void run(CallContext paramCallContext) {
    Consumer consumer = paramCallContext.consumer;
    Object object = require.find("com.google.youngandroid.runtime");
    try {
      Runnable runnable = (Runnable)object;
      runnable.run();
      this.$Stdebug$Mnform$St = Boolean.FALSE;
      SimpleSymbol simpleSymbol = Lit0;
      this.form$Mnenvironment = (Environment)Environment.make(misc.symbol$To$String((Symbol)simpleSymbol));
      object = strings.stringAppend(new Object[] { misc.symbol$To$String((Symbol)simpleSymbol), "-global-vars" });
      if (object == null) {
        object = null;
      } else {
        object = object.toString();
      } 
      this.global$Mnvar$Mnenvironment = (Environment)Environment.make((String)object);
      Screen1 = null;
      this.form$Mnname$Mnsymbol = (Symbol)simpleSymbol;
      this.events$Mnto$Mnregister = LList.Empty;
      this.components$Mnto$Mncreate = LList.Empty;
      this.global$Mnvars$Mnto$Mncreate = LList.Empty;
      this.form$Mndo$Mnafter$Mncreation = LList.Empty;
      object = require.find("com.google.youngandroid.runtime");
      try {
        Runnable runnable1 = (Runnable)object;
        runnable1.run();
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          SimpleSymbol simpleSymbol1 = Lit3;
          Boolean bool = Boolean.TRUE;
          object = Lit4;
          runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol1, bool, object);
          simpleSymbol1 = Lit5;
          SimpleSymbol simpleSymbol2 = Lit6;
          runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol1, "Speech_to_text", simpleSymbol2);
          runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit7, "musical-notes-frame-with-text-space_1017-32857.avif", simpleSymbol2);
          runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit8, "unspecified", simpleSymbol2);
          runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit9, Boolean.TRUE, object);
          runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit10, "Responsive", simpleSymbol2);
          runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit11, "Screen1", simpleSymbol2);
          Values.writeValues(runtime.setAndCoerceProperty$Ex(simpleSymbol, Lit12, Boolean.FALSE, object), consumer);
        } else {
          addToFormDoAfterCreation(new Promise((Procedure)lambda$Fn2));
        } 
        this.HorizontalArrangement1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit13, Lit14, lambda$Fn3), consumer);
        } else {
          addToComponents(simpleSymbol, Lit26, Lit14, lambda$Fn4);
        } 
        this.Label1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit14, Lit27, Lit28, lambda$Fn5), consumer);
        } else {
          addToComponents(Lit14, Lit35, Lit28, lambda$Fn6);
        } 
        this.HorizontalArrangement9 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit36, Lit37, lambda$Fn7), consumer);
        } else {
          addToComponents(simpleSymbol, Lit39, Lit37, lambda$Fn8);
        } 
        this.HorizontalArrangement7 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit40, Lit41, lambda$Fn9), consumer);
        } else {
          addToComponents(simpleSymbol, Lit43, Lit41, lambda$Fn10);
        } 
        this.Label9 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit44, Lit45, lambda$Fn11), consumer);
        } else {
          addToComponents(simpleSymbol, Lit46, Lit45, lambda$Fn12);
        } 
        this.HorizontalArrangement6 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit47, Lit48, lambda$Fn13), consumer);
        } else {
          addToComponents(simpleSymbol, Lit50, Lit48, lambda$Fn14);
        } 
        this.Label8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit48, Lit51, Lit52, lambda$Fn15), consumer);
        } else {
          addToComponents(Lit48, Lit58, Lit52, lambda$Fn16);
        } 
        this.HorizontalArrangement8 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit59, Lit60, lambda$Fn17), consumer);
        } else {
          addToComponents(simpleSymbol, Lit63, Lit60, lambda$Fn18);
        } 
        this.HorizontalArrangement5 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit64, Lit65, lambda$Fn19), consumer);
        } else {
          addToComponents(simpleSymbol, Lit67, Lit65, lambda$Fn20);
        } 
        this.Button4 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(Lit65, Lit68, Lit69, lambda$Fn21), consumer);
        } else {
          addToComponents(Lit65, Lit73, Lit69, lambda$Fn22);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit76, this.Button4$Click);
        } else {
          addToFormEnvironment((Symbol)Lit76, this.Button4$Click);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "Button4", "Click");
        } else {
          addToEvents(Lit69, Lit77);
        } 
        this.HorizontalArrangement10 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit78, Lit79, lambda$Fn23), consumer);
        } else {
          addToComponents(simpleSymbol, Lit81, Lit79, lambda$Fn24);
        } 
        this.HorizontalArrangement11 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit82, Lit83, lambda$Fn25), consumer);
        } else {
          addToComponents(simpleSymbol, Lit85, Lit83, lambda$Fn26);
        } 
        this.SpeechRecognizer1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit86, Lit74, lambda$Fn27), consumer);
        } else {
          addToComponents(simpleSymbol, Lit88, Lit74, lambda$Fn28);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          runtime.addToCurrentFormEnvironment((Symbol)Lit93, this.SpeechRecognizer1$AfterGettingText);
        } else {
          addToFormEnvironment((Symbol)Lit93, this.SpeechRecognizer1$AfterGettingText);
        } 
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "SpeechRecognizer1", "AfterGettingText");
        } else {
          addToEvents(Lit74, Lit94);
        } 
        this.FirebaseDB1 = null;
        if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
          Values.writeValues(runtime.addComponentWithinRepl(simpleSymbol, Lit95, Lit90, lambda$Fn29), consumer);
        } else {
          addToComponents(simpleSymbol, Lit101, Lit90, lambda$Fn30);
        } 
        runtime.initRuntime();
        return;
      } catch (ClassCastException classCastException) {
        throw new WrongType(classCastException, "java.lang.Runnable.run()", 1, object);
      } 
    } catch (ClassCastException classCastException) {
      throw new WrongType(classCastException, "java.lang.Runnable.run()", 1, object);
    } 
  }
  
  public void sendError(Object paramObject) {
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = paramObject.toString();
    } 
    RetValManager.sendError((String)paramObject);
  }
}