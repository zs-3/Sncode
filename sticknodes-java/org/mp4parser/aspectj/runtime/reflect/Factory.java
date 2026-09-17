package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
public final class Factory {
    private static java.lang.Object[] NO_ARGS;
    static /* synthetic */ java.lang.Class class$java$lang$ClassNotFoundException;
    static java.util.Hashtable prims;
    int count;
    java.lang.String filename;
    java.lang.Class lexicalClass;
    java.lang.ClassLoader lookupClassLoader;

    static {
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            org.mp4parser.aspectj.runtime.reflect.Factory.prims = r0
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.String r2 = "void"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r2 = "boolean"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.String r2 = "byte"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.String r2 = "char"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.String r2 = "short"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.String r2 = "int"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.String r2 = "long"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.String r2 = "float"
            r0.put(r2, r1)
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.String r2 = "double"
            r0.put(r2, r1)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            org.mp4parser.aspectj.runtime.reflect.Factory.NO_ARGS = r0
            return
    }

    public Factory(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            r0.<init>()
            r0.filename = r1
            r0.lexicalClass = r2
            r1 = 0
            r0.count = r1
            java.lang.ClassLoader r1 = r2.getClassLoader()
            r0.lookupClassLoader = r1
            return
    }

    static /* synthetic */ java.lang.Class class$(java.lang.String r1) {
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
            java.lang.String r1 = r1.getMessage()
            r0.<init>(r1)
            throw r0
    }

    static java.lang.Class makeClass(java.lang.String r1, java.lang.ClassLoader r2) {
            java.lang.String r0 = "*"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La
            r1 = 0
            return r1
        La:
            java.util.Hashtable r0 = org.mp4parser.aspectj.runtime.reflect.Factory.prims
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L15
            return r0
        L15:
            if (r2 != 0) goto L1c
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L22
            return r1
        L1c:
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.ClassNotFoundException -> L22
            return r1
        L22:
            java.lang.Class r1 = org.mp4parser.aspectj.runtime.reflect.Factory.class$java$lang$ClassNotFoundException
            if (r1 != 0) goto L2f
            java.lang.String r1 = "java.lang.ClassNotFoundException"
            java.lang.Class r1 = class$(r1)
            org.mp4parser.aspectj.runtime.reflect.Factory.class$java$lang$ClassNotFoundException = r1
        L2f:
            return r1
    }

    public static org.mp4parser.aspectj.lang.JoinPoint makeJP(org.mp4parser.aspectj.lang.JoinPoint.StaticPart r2, java.lang.Object r3, java.lang.Object r4) {
            org.mp4parser.aspectj.runtime.reflect.JoinPointImpl r0 = new org.mp4parser.aspectj.runtime.reflect.JoinPointImpl
            java.lang.Object[] r1 = org.mp4parser.aspectj.runtime.reflect.Factory.NO_ARGS
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public static org.mp4parser.aspectj.lang.JoinPoint makeJP(org.mp4parser.aspectj.lang.JoinPoint.StaticPart r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            org.mp4parser.aspectj.runtime.reflect.JoinPointImpl r0 = new org.mp4parser.aspectj.runtime.reflect.JoinPointImpl
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r0.<init>(r3, r4, r5, r1)
            return r0
    }

    public static org.mp4parser.aspectj.lang.JoinPoint makeJP(org.mp4parser.aspectj.lang.JoinPoint.StaticPart r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            org.mp4parser.aspectj.runtime.reflect.JoinPointImpl r0 = new org.mp4parser.aspectj.runtime.reflect.JoinPointImpl
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r0.<init>(r3, r4, r5, r1)
            return r0
    }

    public static org.mp4parser.aspectj.lang.JoinPoint makeJP(org.mp4parser.aspectj.lang.JoinPoint.StaticPart r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object[] r4) {
            org.mp4parser.aspectj.runtime.reflect.JoinPointImpl r0 = new org.mp4parser.aspectj.runtime.reflect.JoinPointImpl
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public org.mp4parser.aspectj.lang.reflect.MethodSignature makeMethodSig(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r11 = this;
            r0 = r11
            r1 = 16
            r2 = r12
            int r3 = java.lang.Integer.parseInt(r12, r1)
            java.lang.ClassLoader r1 = r0.lookupClassLoader
            r2 = r14
            java.lang.Class r5 = makeClass(r14, r1)
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = ":"
            r4 = r15
            r1.<init>(r15, r2)
            int r4 = r1.countTokens()
            java.lang.Class[] r6 = new java.lang.Class[r4]
            r7 = 0
            r8 = 0
        L1f:
            if (r8 >= r4) goto L30
            java.lang.String r9 = r1.nextToken()
            java.lang.ClassLoader r10 = r0.lookupClassLoader
            java.lang.Class r9 = makeClass(r9, r10)
            r6[r8] = r9
            int r8 = r8 + 1
            goto L1f
        L30:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r4 = r16
            r1.<init>(r4, r2)
            int r4 = r1.countTokens()
            java.lang.String[] r8 = new java.lang.String[r4]
            r9 = 0
        L3e:
            if (r9 >= r4) goto L49
            java.lang.String r10 = r1.nextToken()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L3e
        L49:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            r4 = r17
            r1.<init>(r4, r2)
            int r2 = r1.countTokens()
            java.lang.Class[] r9 = new java.lang.Class[r2]
        L56:
            if (r7 >= r2) goto L67
            java.lang.String r4 = r1.nextToken()
            java.lang.ClassLoader r10 = r0.lookupClassLoader
            java.lang.Class r4 = makeClass(r4, r10)
            r9[r7] = r4
            int r7 = r7 + 1
            goto L56
        L67:
            java.lang.ClassLoader r1 = r0.lookupClassLoader
            r2 = r18
            java.lang.Class r1 = makeClass(r2, r1)
            org.mp4parser.aspectj.runtime.reflect.MethodSignatureImpl r10 = new org.mp4parser.aspectj.runtime.reflect.MethodSignatureImpl
            r2 = r10
            r4 = r13
            r7 = r8
            r8 = r9
            r9 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public org.mp4parser.aspectj.lang.JoinPoint.StaticPart makeSJP(java.lang.String r4, org.mp4parser.aspectj.lang.Signature r5, int r6) {
            r3 = this;
            org.mp4parser.aspectj.runtime.reflect.JoinPointImpl$StaticPartImpl r0 = new org.mp4parser.aspectj.runtime.reflect.JoinPointImpl$StaticPartImpl
            int r1 = r3.count
            int r2 = r1 + 1
            r3.count = r2
            r2 = -1
            org.mp4parser.aspectj.lang.reflect.SourceLocation r6 = r3.makeSourceLoc(r6, r2)
            r0.<init>(r1, r4, r5, r6)
            return r0
    }

    public org.mp4parser.aspectj.lang.reflect.SourceLocation makeSourceLoc(int r3, int r4) {
            r2 = this;
            org.mp4parser.aspectj.runtime.reflect.SourceLocationImpl r4 = new org.mp4parser.aspectj.runtime.reflect.SourceLocationImpl
            java.lang.Class r0 = r2.lexicalClass
            java.lang.String r1 = r2.filename
            r4.<init>(r0, r1, r3)
            return r4
    }
}
