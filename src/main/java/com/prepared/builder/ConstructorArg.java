package com.prepared.builder;

import java.util.Objects;

/**
 * 当 isRef 为 true 的时候，arg 表示 String 类型的 refBeanId，type 不需要设置；
 * 当 isRef 为 false 的时候，arg、type 都需要设置。请根据这个需求，完善 ConstructorArg 类。
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    public boolean isRef() {
        return isRef;
    }

    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }

    public static class Builder {
        private boolean isRef;
        private Class type;
        private Object arg;

        public Builder setRef(boolean ref) {
            this.isRef = ref;
            return this;
        }

        public Builder setType(Class type) {
            this.type = type;
            return this;
        }

        public Builder setArg(Object arg) {
            this.arg = arg;
            return this;
        }

        public ConstructorArg builder() {
            if (isRef) {
                if (arg instanceof String) {

                } else {
                    throw new IllegalArgumentException("isRef为true的时候，arg必须为 String 类型");
                }
            }
            if (!isRef) {
                if (Objects.isNull(type) || Objects.isNull(arg)) {
                    throw new IllegalArgumentException("isRef为false的时候，arg和type都必须设置");
                }
            }
            return new ConstructorArg(this);
        }
    }

    public static void main(String[] args) {
//        ConstructorArg constructorArg = new ConstructorArg.Builder()
//                .setRef(true)
//                .setArg(123)
//                .builder();

        ConstructorArg constructorArg2 = new ConstructorArg.Builder()
                .setRef(false)
                .setArg("123")
                .builder();
    }
}