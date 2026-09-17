package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
class MethodSignatureImpl extends org.mp4parser.aspectj.runtime.reflect.CodeSignatureImpl implements org.mp4parser.aspectj.lang.reflect.MethodSignature {
    java.lang.Class returnType;

    MethodSignatureImpl(int r1, java.lang.String r2, java.lang.Class r3, java.lang.Class[] r4, java.lang.String[] r5, java.lang.Class[] r6, java.lang.Class r7) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.returnType = r7
            return
    }

    @Override // org.mp4parser.aspectj.runtime.reflect.SignatureImpl
    protected java.lang.String createToString(org.mp4parser.aspectj.runtime.reflect.StringMaker r4) {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r1 = r3.getModifiers()
            java.lang.String r1 = r4.makeModifiersString(r1)
            r0.append(r1)
            boolean r1 = r4.includeArgs
            if (r1 == 0) goto L1f
            java.lang.Class r1 = r3.getReturnType()
            java.lang.String r1 = r4.makeTypeName(r1)
            r0.append(r1)
        L1f:
            boolean r1 = r4.includeArgs
            if (r1 == 0) goto L28
            java.lang.String r1 = " "
            r0.append(r1)
        L28:
            java.lang.Class r1 = r3.getDeclaringType()
            java.lang.String r2 = r3.getDeclaringTypeName()
            java.lang.String r1 = r4.makePrimaryTypeName(r1, r2)
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.Class[] r1 = r3.getParameterTypes()
            r4.addSignature(r0, r1)
            java.lang.Class[] r1 = r3.getExceptionTypes()
            r4.addThrows(r0, r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public java.lang.Class getReturnType() {
            r1 = this;
            java.lang.Class r0 = r1.returnType
            if (r0 != 0) goto Lb
            r0 = 6
            java.lang.Class r0 = r1.extractType(r0)
            r1.returnType = r0
        Lb:
            java.lang.Class r0 = r1.returnType
            return r0
    }
}
