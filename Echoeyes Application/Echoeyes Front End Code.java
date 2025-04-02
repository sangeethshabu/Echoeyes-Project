package appinventor.ai_alnefa77.Speech_to_text;

import android.os.Bundle;
import com.google.appinventor.components.runtime.Component;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleMethod;
import gnu.mapping.CallContext;
import gnu.mapping.Procedure;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;

public class Screen1$frame extends ModuleBody {
  Screen1 $main;
  
  public Object apply0(ModuleMethod paramModuleMethod) {
    switch (paramModuleMethod.selector) {
      default:
        return super.apply0(paramModuleMethod);
      case 50:
        return Screen1.lambda31();
      case 49:
        return Screen1.lambda30();
      case 47:
        return Screen1.lambda29();
      case 46:
        return Screen1.lambda28();
      case 45:
        return Screen1.lambda27();
      case 44:
        return Screen1.lambda26();
      case 43:
        return Screen1.lambda25();
      case 42:
        return Screen1.lambda24();
      case 41:
        return this.$main.Button4$Click();
      case 40:
        return Screen1.lambda23();
      case 39:
        return Screen1.lambda22();
      case 38:
        return Screen1.lambda21();
      case 37:
        return Screen1.lambda20();
      case 36:
        return Screen1.lambda19();
      case 35:
        return Screen1.lambda18();
      case 34:
        return Screen1.lambda17();
      case 33:
        return Screen1.lambda16();
      case 32:
        return Screen1.lambda15();
      case 31:
        return Screen1.lambda14();
      case 30:
        return Screen1.lambda13();
      case 29:
        return Screen1.lambda12();
      case 28:
        return Screen1.lambda11();
      case 27:
        return Screen1.lambda10();
      case 26:
        return Screen1.lambda9();
      case 25:
        return Screen1.lambda8();
      case 24:
        return Screen1.lambda7();
      case 23:
        return Screen1.lambda6();
      case 22:
        return Screen1.lambda5();
      case 21:
        return Screen1.lambda4();
      case 20:
        return Screen1.lambda3();
      case 19:
        this.$main.$define();
        return Values.empty;
      case 18:
        break;
    } 
    return Screen1.lambda2();
  }
  
  public Object apply1(ModuleMethod paramModuleMethod, Object paramObject) {
    Screen1 screen1;
    switch (paramModuleMethod.selector) {
      default:
        return super.apply1(paramModuleMethod, paramObject);
      case 14:
        this.$main.processException(paramObject);
        return Values.empty;
      case 13:
        this.$main.sendError(paramObject);
        return Values.empty;
      case 12:
        this.$main.addToFormDoAfterCreation(paramObject);
        return Values.empty;
      case 7:
        screen1 = this.$main;
        try {
          Symbol symbol = (Symbol)paramObject;
          return screen1.isBoundInFormEnvironment(symbol) ? Boolean.TRUE : Boolean.FALSE;
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "is-bound-in-form-environment", 1, paramObject);
        } 
      case 5:
        screen1 = this.$main;
        try {
          Symbol symbol = (Symbol)paramObject;
          return screen1.lookupInFormEnvironment(symbol);
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "lookup-in-form-environment", 1, paramObject);
        } 
      case 3:
        this.$main.androidLogForm(paramObject);
        return Values.empty;
      case 2:
        screen1 = this.$main;
        try {
          Bundle bundle = (Bundle)paramObject;
          screen1.onCreate(bundle);
          return Values.empty;
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "onCreate", 1, paramObject);
        } 
      case 1:
        break;
    } 
    return this.$main.getSimpleName(paramObject);
  }
  
  public Object apply2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2) {
    switch (paramModuleMethod.selector) {
      default:
        return super.apply2(paramModuleMethod, paramObject1, paramObject2);
      case 48:
        return this.$main.SpeechRecognizer1$AfterGettingText(paramObject1, paramObject2);
      case 17:
        return this.$main.lookupHandler(paramObject1, paramObject2);
      case 11:
        this.$main.addToGlobalVars(paramObject1, paramObject2);
        return Values.empty;
      case 9:
        this.$main.addToEvents(paramObject1, paramObject2);
        return Values.empty;
      case 8:
        screen1 = this.$main;
        try {
          Symbol symbol = (Symbol)paramObject1;
          screen1.addToGlobalVarEnvironment(symbol, paramObject2);
          return Values.empty;
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "add-to-global-var-environment", 1, paramObject1);
        } 
      case 5:
        screen1 = this.$main;
        try {
          Symbol symbol = (Symbol)paramObject1;
          return screen1.lookupInFormEnvironment(symbol, paramObject2);
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "lookup-in-form-environment", 1, paramObject1);
        } 
      case 4:
        break;
    } 
    Screen1 screen1 = this.$main;
    try {
      Symbol symbol = (Symbol)paramObject1;
      screen1.addToFormEnvironment(symbol, paramObject2);
      return Values.empty;
    } catch (ClassCastException classCastException) {
      throw new WrongType(classCastException, "add-to-form-environment", 1, paramObject1);
    } 
  }
  
  public Object apply4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Screen1 screen1;
    int i = paramModuleMethod.selector;
    boolean bool = true;
    switch (i) {
      default:
        return super.apply4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4);
      case 16:
        screen1 = this.$main;
        try {
          Component component = (Component)paramObject1;
          try {
            paramObject1 = paramObject2;
            try {
              paramObject2 = Boolean.FALSE;
              if (paramObject3 == paramObject2)
                bool = false; 
              try {
                paramObject2 = paramObject4;
                screen1.dispatchGenericEvent(component, (String)paramObject1, bool, (Object[])paramObject2);
                return Values.empty;
              } catch (ClassCastException classCastException) {
                throw new WrongType(classCastException, "dispatchGenericEvent", 4, paramObject4);
              } 
            } catch (ClassCastException classCastException) {
              throw new WrongType(classCastException, "dispatchGenericEvent", 3, paramObject3);
            } 
          } catch (ClassCastException classCastException) {
            throw new WrongType(classCastException, "dispatchGenericEvent", 2, paramObject2);
          } 
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "dispatchGenericEvent", 1, paramObject1);
        } 
      case 15:
        screen1 = this.$main;
        try {
          Component component = (Component)paramObject1;
          try {
            paramObject1 = paramObject2;
            try {
              paramObject2 = paramObject3;
              try {
                paramObject3 = paramObject4;
                return screen1.dispatchEvent(component, (String)paramObject1, (String)paramObject2, (Object[])paramObject3) ? Boolean.TRUE : Boolean.FALSE;
              } catch (ClassCastException classCastException) {
                throw new WrongType(classCastException, "dispatchEvent", 4, paramObject4);
              } 
            } catch (ClassCastException classCastException) {
              throw new WrongType(classCastException, "dispatchEvent", 3, paramObject3);
            } 
          } catch (ClassCastException classCastException) {
            throw new WrongType(classCastException, "dispatchEvent", 2, paramObject2);
          } 
        } catch (ClassCastException classCastException) {
          throw new WrongType(classCastException, "dispatchEvent", 1, paramObject1);
        } 
      case 10:
        break;
    } 
    this.$main.addToComponents(paramObject1, paramObject2, paramObject3, paramObject4);
    return Values.empty;
  }
  
  public int match0(ModuleMethod paramModuleMethod, CallContext paramCallContext) {
    switch (paramModuleMethod.selector) {
      default:
        return super.match0(paramModuleMethod, paramCallContext);
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 49:
      case 50:
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 0;
        return 0;
      case 19:
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 0;
        return 0;
      case 18:
        break;
    } 
    paramCallContext.proc = (Procedure)paramModuleMethod;
    paramCallContext.pc = 0;
    return 0;
  }
  
  public int match1(ModuleMethod paramModuleMethod, Object paramObject, CallContext paramCallContext) {
    switch (paramModuleMethod.selector) {
      default:
        return super.match1(paramModuleMethod, paramObject, paramCallContext);
      case 14:
        if (!(paramObject instanceof Screen1))
          return -786431; 
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 13:
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 12:
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 7:
        if (!(paramObject instanceof Symbol))
          return -786431; 
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 5:
        if (!(paramObject instanceof Symbol))
          return -786431; 
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 3:
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 2:
        if (!(paramObject instanceof Screen1))
          return -786431; 
        paramCallContext.value1 = paramObject;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 1;
        return 0;
      case 1:
        break;
    } 
    paramCallContext.value1 = paramObject;
    paramCallContext.proc = (Procedure)paramModuleMethod;
    paramCallContext.pc = 1;
    return 0;
  }
  
  public int match2(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, CallContext paramCallContext) {
    switch (paramModuleMethod.selector) {
      default:
        return super.match2(paramModuleMethod, paramObject1, paramObject2, paramCallContext);
      case 48:
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 17:
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 11:
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 9:
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 8:
        if (!(paramObject1 instanceof Symbol))
          return -786431; 
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 5:
        if (!(paramObject1 instanceof Symbol))
          return -786431; 
        paramCallContext.value1 = paramObject1;
        paramCallContext.value2 = paramObject2;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 2;
        return 0;
      case 4:
        break;
    } 
    if (!(paramObject1 instanceof Symbol))
      return -786431; 
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.proc = (Procedure)paramModuleMethod;
    paramCallContext.pc = 2;
    return 0;
  }
  
  public int match4(ModuleMethod paramModuleMethod, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, CallContext paramCallContext) {
    switch (paramModuleMethod.selector) {
      default:
        return super.match4(paramModuleMethod, paramObject1, paramObject2, paramObject3, paramObject4, paramCallContext);
      case 16:
        if (!(paramObject1 instanceof Screen1))
          return -786431; 
        paramCallContext.value1 = paramObject1;
        if (!(paramObject2 instanceof Component))
          return -786430; 
        paramCallContext.value2 = paramObject2;
        if (!(paramObject3 instanceof String))
          return -786429; 
        paramCallContext.value3 = paramObject3;
        paramCallContext.value4 = paramObject4;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 4;
        return 0;
      case 15:
        if (!(paramObject1 instanceof Screen1))
          return -786431; 
        paramCallContext.value1 = paramObject1;
        if (!(paramObject2 instanceof Component))
          return -786430; 
        paramCallContext.value2 = paramObject2;
        if (!(paramObject3 instanceof String))
          return -786429; 
        paramCallContext.value3 = paramObject3;
        if (!(paramObject4 instanceof String))
          return -786428; 
        paramCallContext.value4 = paramObject4;
        paramCallContext.proc = (Procedure)paramModuleMethod;
        paramCallContext.pc = 4;
        return 0;
      case 10:
        break;
    } 
    paramCallContext.value1 = paramObject1;
    paramCallContext.value2 = paramObject2;
    paramCallContext.value3 = paramObject3;
    paramCallContext.value4 = paramObject4;
    paramCallContext.proc = (Procedure)paramModuleMethod;
    paramCallContext.pc = 4;
    return 0;
  }
}