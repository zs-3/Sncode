package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
abstract class SignatureImpl implements org.mp4parser.aspectj.lang.Signature {
    static java.lang.Class[] EMPTY_CLASS_ARRAY = null;
    static java.lang.String[] EMPTY_STRING_ARRAY = null;
    private static boolean useCache = true;
    java.lang.Class declaringType;
    java.lang.String declaringTypeName;
    java.lang.ClassLoader lookupClassLoader;
    int modifiers;
    java.lang.String name;
    org.mp4parser.aspectj.runtime.reflect.SignatureImpl.Cache stringCache;
    private java.lang.String stringRep;

    private interface Cache {
        java.lang.String get(int r1);

        void set(int r1, java.lang.String r2);
    }

    private static final class CacheImpl implements org.mp4parser.aspectj.runtime.reflect.SignatureImpl.Cache {
        private java.lang.ref.SoftReference toStringCacheRef;

        public CacheImpl() {
                r0 = this;
                r0.<init>()
                r0.makeCache()
                return
        }

        private java.lang.String[] array() {
                r1 = this;
                java.lang.ref.SoftReference r0 = r1.toStringCacheRef
                java.lang.Object r0 = r0.get()
                java.lang.String[] r0 = (java.lang.String[]) r0
                return r0
        }

        private java.lang.String[] makeCache() {
                r2 = this;
                r0 = 3
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference
                r1.<init>(r0)
                r2.toStringCacheRef = r1
                return r0
        }

        @Override // org.mp4parser.aspectj.runtime.reflect.SignatureImpl.Cache
        public java.lang.String get(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.array()
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                r2 = r0[r2]
                return r2
        }

        @Override // org.mp4parser.aspectj.runtime.reflect.SignatureImpl.Cache
        public void set(int r2, java.lang.String r3) {
                r1 = this;
                java.lang.String[] r0 = r1.array()
                if (r0 != 0) goto La
                java.lang.String[] r0 = r1.makeCache()
            La:
                r0[r2] = r3
                return
        }
    }

    static {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl.EMPTY_STRING_ARRAY = r1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl.EMPTY_CLASS_ARRAY = r0
            return
    }

    SignatureImpl(int r2, java.lang.String r3, java.lang.Class r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.lookupClassLoader = r0
            r1.modifiers = r2
            r1.name = r3
            r1.declaringType = r4
            return
    }

    private java.lang.ClassLoader getLookupClassLoader() {
            r1 = this;
            java.lang.ClassLoader r0 = r1.lookupClassLoader
            if (r0 != 0) goto Le
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.lookupClassLoader = r0
        Le:
            java.lang.ClassLoader r0 = r1.lookupClassLoader
            return r0
    }

    protected abstract java.lang.String createToString(org.mp4parser.aspectj.runtime.reflect.StringMaker r1);

    int extractInt(int r2) {
            r1 = this;
            java.lang.String r2 = r1.extractString(r2)
            r0 = 16
            int r2 = java.lang.Integer.parseInt(r2, r0)
            return r2
    }

    java.lang.String extractString(int r5) {
            r4 = this;
            java.lang.String r0 = r4.stringRep
            r1 = 45
            int r0 = r0.indexOf(r1)
            r2 = 0
        L9:
            int r3 = r5 + (-1)
            if (r5 <= 0) goto L17
            int r2 = r0 + 1
            java.lang.String r5 = r4.stringRep
            int r0 = r5.indexOf(r1, r2)
            r5 = r3
            goto L9
        L17:
            r5 = -1
            if (r0 != r5) goto L20
            java.lang.String r5 = r4.stringRep
            int r0 = r5.length()
        L20:
            java.lang.String r5 = r4.stringRep
            java.lang.String r5 = r5.substring(r2, r0)
            return r5
    }

    java.lang.Class extractType(int r2) {
            r1 = this;
            java.lang.String r2 = r1.extractString(r2)
            java.lang.ClassLoader r0 = r1.getLookupClassLoader()
            java.lang.Class r2 = org.mp4parser.aspectj.runtime.reflect.Factory.makeClass(r2, r0)
            return r2
    }

    java.lang.Class[] extractTypes(int r6) {
            r5 = this;
            java.lang.String r6 = r5.extractString(r6)
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ":"
            r0.<init>(r6, r1)
            int r6 = r0.countTokens()
            java.lang.Class[] r1 = new java.lang.Class[r6]
            r2 = 0
        L12:
            if (r2 >= r6) goto L25
            java.lang.String r3 = r0.nextToken()
            java.lang.ClassLoader r4 = r5.getLookupClassLoader()
            java.lang.Class r3 = org.mp4parser.aspectj.runtime.reflect.Factory.makeClass(r3, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L25:
            return r1
    }

    public java.lang.Class getDeclaringType() {
            r1 = this;
            java.lang.Class r0 = r1.declaringType
            if (r0 != 0) goto Lb
            r0 = 2
            java.lang.Class r0 = r1.extractType(r0)
            r1.declaringType = r0
        Lb:
            java.lang.Class r0 = r1.declaringType
            return r0
    }

    public java.lang.String getDeclaringTypeName() {
            r1 = this;
            java.lang.String r0 = r1.declaringTypeName
            if (r0 != 0) goto Le
            java.lang.Class r0 = r1.getDeclaringType()
            java.lang.String r0 = r0.getName()
            r1.declaringTypeName = r0
        Le:
            java.lang.String r0 = r1.declaringTypeName
            return r0
    }

    public int getModifiers() {
            r2 = this;
            int r0 = r2.modifiers
            r1 = -1
            if (r0 != r1) goto Lc
            r0 = 0
            int r0 = r2.extractInt(r0)
            r2.modifiers = r0
        Lc:
            int r0 = r2.modifiers
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            if (r0 != 0) goto Lb
            r0 = 1
            java.lang.String r0 = r1.extractString(r0)
            r1.name = r0
        Lb:
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = org.mp4parser.aspectj.runtime.reflect.StringMaker.middleStringMaker
            java.lang.String r0 = r1.toString(r0)
            return r0
    }

    java.lang.String toString(org.mp4parser.aspectj.runtime.reflect.StringMaker r3) {
            r2 = this;
            boolean r0 = org.mp4parser.aspectj.runtime.reflect.SignatureImpl.useCache
            if (r0 == 0) goto L1b
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl$Cache r0 = r2.stringCache
            if (r0 != 0) goto L14
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl$CacheImpl r0 = new org.mp4parser.aspectj.runtime.reflect.SignatureImpl$CacheImpl     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            r2.stringCache = r0     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r0 = 0
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl.useCache = r0
            goto L1b
        L14:
            int r1 = r3.cacheOffset
            java.lang.String r0 = r0.get(r1)
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L22
            java.lang.String r0 = r2.createToString(r3)
        L22:
            boolean r1 = org.mp4parser.aspectj.runtime.reflect.SignatureImpl.useCache
            if (r1 == 0) goto L2d
            org.mp4parser.aspectj.runtime.reflect.SignatureImpl$Cache r1 = r2.stringCache
            int r3 = r3.cacheOffset
            r1.set(r3, r0)
        L2d:
            return r0
    }
}
