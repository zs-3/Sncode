package com.badlogic.gdx.utils.reflect;

/* loaded from: classes.dex */
public final class Field {
    private final java.lang.reflect.Field field;

    Field(java.lang.reflect.Field r1) {
            r0 = this;
            r0.<init>()
            r0.field = r1
            return
    }

    public java.lang.Object get(java.lang.Object r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            r3 = this;
            java.lang.reflect.Field r0 = r3.field     // Catch: java.lang.IllegalAccessException -> L7 java.lang.IllegalArgumentException -> L23
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L7 java.lang.IllegalArgumentException -> L23
            return r4
        L7:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal access to field: "
            r1.append(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
        L23:
            r4 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r0 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Object is not an instance of "
            r1.append(r2)
            java.lang.Class r2 = r3.getDeclaringClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            throw r0
    }

    public java.lang.Class getDeclaringClass() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getDeclaringClass()
            return r0
    }

    public java.lang.Class getElementType(int r3) {
            r2 = this;
            java.lang.reflect.Field r0 = r2.field
            java.lang.reflect.Type r0 = r0.getGenericType()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L45
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r1 < r3) goto L45
            r3 = r0[r3]
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1e
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L1e:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2b
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L2b:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L45
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L45
            java.lang.Class r3 = (java.lang.Class) r3
            r0 = 0
            java.lang.Object r3 = com.badlogic.gdx.utils.reflect.ArrayReflection.newInstance(r3, r0)
            java.lang.Class r3 = r3.getClass()
            return r3
        L45:
            r3 = 0
            return r3
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.String r0 = r0.getName()
            return r0
    }

    public java.lang.Class getType() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            java.lang.Class r0 = r0.getType()
            return r0
    }

    public boolean isAccessible() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            boolean r0 = r0.isAccessible()
            return r0
    }

    public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            boolean r2 = r0.isAnnotationPresent(r2)
            return r2
    }

    public boolean isStatic() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            return r0
    }

    public boolean isSynthetic() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            boolean r0 = r0.isSynthetic()
            return r0
    }

    public boolean isTransient() {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isTransient(r0)
            return r0
    }

    public void set(java.lang.Object r3, java.lang.Object r4) throws com.badlogic.gdx.utils.reflect.ReflectionException {
            r2 = this;
            java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.IllegalAccessException -> L6 java.lang.IllegalArgumentException -> L22
            r0.set(r3, r4)     // Catch: java.lang.IllegalAccessException -> L6 java.lang.IllegalArgumentException -> L22
            return
        L6:
            r3 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r4 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal access to field: "
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            throw r4
        L22:
            r3 = move-exception
            com.badlogic.gdx.utils.reflect.ReflectionException r4 = new com.badlogic.gdx.utils.reflect.ReflectionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Argument not valid for field: "
            r0.append(r1)
            java.lang.String r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0, r3)
            throw r4
    }

    public void setAccessible(boolean r2) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field
            r0.setAccessible(r2)
            return
    }
}
