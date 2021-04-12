package com.prepared.factory;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhongshibo
 * @Date: 2021/4/12 16:18
 */
public class BeanDefinition {

    private String id;

    private String className;

    private List<ConstructorArg> constructorArgs = new ArrayList<>();

    private Scope scope = Scope.SINGLETON;

    private boolean lazyInit = false;

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void setConstructorArgs(List<ConstructorArg> constructorArgs) {
        this.constructorArgs = constructorArgs;
    }

    public boolean isSingleton() {
        return scope.equals(Scope.SINGLETON);
    }

    public static enum Scope {SINGLETON, PROTOTYPE}

    public static class ConstructorArg {
        private boolean isRef;
        private Class type;
        private Object arg;    // 省略必要的getter/setter/constructors  }

        public boolean getIsRef() {
            return isRef;
        }

        public void setRef(boolean ref) {
            isRef = ref;
        }

        public Class getType() {
            return type;
        }

        public void setType(Class type) {
            this.type = type;
        }

        public Object getArg() {
            return arg;
        }

        public void setArg(Object arg) {
            this.arg = arg;
        }
    }
}