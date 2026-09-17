package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
class StringMaker {
    static org.mp4parser.aspectj.runtime.reflect.StringMaker longStringMaker;
    static org.mp4parser.aspectj.runtime.reflect.StringMaker middleStringMaker;
    static org.mp4parser.aspectj.runtime.reflect.StringMaker shortStringMaker;
    int cacheOffset;
    boolean includeArgs;
    boolean includeEnclosingPoint;
    boolean includeJoinPointTypeName;
    boolean includeModifiers;
    boolean includeThrows;
    boolean shortKindName;
    boolean shortPrimaryTypeNames;
    boolean shortTypeNames;

    static {
            org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = new org.mp4parser.aspectj.runtime.reflect.StringMaker
            r0.<init>()
            org.mp4parser.aspectj.runtime.reflect.StringMaker.shortStringMaker = r0
            r1 = 1
            r0.shortTypeNames = r1
            r2 = 0
            r0.includeArgs = r2
            r0.includeThrows = r2
            r0.includeModifiers = r2
            r0.shortPrimaryTypeNames = r1
            r0.includeJoinPointTypeName = r2
            r0.includeEnclosingPoint = r2
            r0.cacheOffset = r2
            org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = new org.mp4parser.aspectj.runtime.reflect.StringMaker
            r0.<init>()
            org.mp4parser.aspectj.runtime.reflect.StringMaker.middleStringMaker = r0
            r0.shortTypeNames = r1
            r0.includeArgs = r1
            r0.includeThrows = r2
            r0.includeModifiers = r2
            r0.shortPrimaryTypeNames = r2
            org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = org.mp4parser.aspectj.runtime.reflect.StringMaker.shortStringMaker
            r0.cacheOffset = r1
            org.mp4parser.aspectj.runtime.reflect.StringMaker r0 = new org.mp4parser.aspectj.runtime.reflect.StringMaker
            r0.<init>()
            org.mp4parser.aspectj.runtime.reflect.StringMaker.longStringMaker = r0
            r0.shortTypeNames = r2
            r0.includeArgs = r1
            r0.includeThrows = r2
            r0.includeModifiers = r1
            r0.shortPrimaryTypeNames = r2
            r0.shortKindName = r2
            r1 = 2
            r0.cacheOffset = r1
            return
    }

    StringMaker() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.shortTypeNames = r0
            r2.includeArgs = r0
            r1 = 0
            r2.includeThrows = r1
            r2.includeModifiers = r1
            r2.shortPrimaryTypeNames = r1
            r2.includeJoinPointTypeName = r0
            r2.includeEnclosingPoint = r0
            r2.shortKindName = r0
            return
    }

    public void addSignature(java.lang.StringBuffer r2, java.lang.Class[] r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r1.includeArgs
            if (r0 != 0) goto L16
            int r3 = r3.length
            if (r3 != 0) goto L10
            java.lang.String r3 = "()"
            r2.append(r3)
            return
        L10:
            java.lang.String r3 = "(..)"
            r2.append(r3)
            return
        L16:
            java.lang.String r0 = "("
            r2.append(r0)
            r1.addTypeNames(r2, r3)
            java.lang.String r3 = ")"
            r2.append(r3)
            return
    }

    public void addThrows(java.lang.StringBuffer r2, java.lang.Class[] r3) {
            r1 = this;
            boolean r0 = r1.includeThrows
            if (r0 == 0) goto L12
            if (r3 == 0) goto L12
            int r0 = r3.length
            if (r0 != 0) goto La
            goto L12
        La:
            java.lang.String r0 = " throws "
            r2.append(r0)
            r1.addTypeNames(r2, r3)
        L12:
            return
    }

    public void addTypeNames(java.lang.StringBuffer r3, java.lang.Class[] r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L17
            if (r0 <= 0) goto Lb
            java.lang.String r1 = ", "
            r3.append(r1)
        Lb:
            r1 = r4[r0]
            java.lang.String r1 = r2.makeTypeName(r1)
            r3.append(r1)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    java.lang.String makeKindName(java.lang.String r3) {
            r2 = this;
            r0 = 45
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            return r3
        La:
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
    }

    java.lang.String makeModifiersString(int r3) {
            r2 = this;
            boolean r0 = r2.includeModifiers
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r3 = java.lang.reflect.Modifier.toString(r3)
            int r0 = r3.length()
            if (r0 != 0) goto L12
            return r1
        L12:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public java.lang.String makePrimaryTypeName(java.lang.Class r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.shortPrimaryTypeNames
            java.lang.String r2 = r1.makeTypeName(r2, r3, r0)
            return r2
    }

    public java.lang.String makeTypeName(java.lang.Class r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            boolean r1 = r2.shortTypeNames
            java.lang.String r3 = r2.makeTypeName(r3, r0, r1)
            return r3
    }

    java.lang.String makeTypeName(java.lang.Class r2, java.lang.String r3, boolean r4) {
            r1 = this;
            if (r2 != 0) goto L5
            java.lang.String r2 = "ANONYMOUS"
            return r2
        L5:
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L29
            java.lang.Class r2 = r2.getComponentType()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            java.lang.String r0 = r2.getName()
            java.lang.String r2 = r1.makeTypeName(r2, r0, r4)
            r3.append(r2)
            java.lang.String r2 = "[]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
        L29:
            r2 = 46
            r0 = 36
            if (r4 == 0) goto L38
            java.lang.String r3 = r1.stripPackageName(r3)
            java.lang.String r2 = r3.replace(r0, r2)
            return r2
        L38:
            java.lang.String r2 = r3.replace(r0, r2)
            return r2
    }

    java.lang.String stripPackageName(java.lang.String r3) {
            r2 = this;
            r0 = 46
            int r0 = r3.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            return r3
        La:
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            return r3
    }
}
