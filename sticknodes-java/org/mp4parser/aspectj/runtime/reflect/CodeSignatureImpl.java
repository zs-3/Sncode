package org.mp4parser.aspectj.runtime.reflect;

/* loaded from: classes2.dex */
abstract class CodeSignatureImpl extends org.mp4parser.aspectj.runtime.reflect.MemberSignatureImpl {
    java.lang.Class[] exceptionTypes;
    java.lang.String[] parameterNames;
    java.lang.Class[] parameterTypes;

    CodeSignatureImpl(int r1, java.lang.String r2, java.lang.Class r3, java.lang.Class[] r4, java.lang.String[] r5, java.lang.Class[] r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.parameterTypes = r4
            r0.parameterNames = r5
            r0.exceptionTypes = r6
            return
    }

    public java.lang.Class[] getExceptionTypes() {
            r1 = this;
            java.lang.Class[] r0 = r1.exceptionTypes
            if (r0 != 0) goto Lb
            r0 = 5
            java.lang.Class[] r0 = r1.extractTypes(r0)
            r1.exceptionTypes = r0
        Lb:
            java.lang.Class[] r0 = r1.exceptionTypes
            return r0
    }

    public java.lang.Class[] getParameterTypes() {
            r1 = this;
            java.lang.Class[] r0 = r1.parameterTypes
            if (r0 != 0) goto Lb
            r0 = 3
            java.lang.Class[] r0 = r1.extractTypes(r0)
            r1.parameterTypes = r0
        Lb:
            java.lang.Class[] r0 = r1.parameterTypes
            return r0
    }
}
