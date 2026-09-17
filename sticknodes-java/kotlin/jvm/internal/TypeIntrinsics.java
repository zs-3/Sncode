package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class TypeIntrinsics {
    public TypeIntrinsics() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object beforeCheckcastToFunctionOfArity(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L1c
            boolean r0 = isFunctionOfArity(r2, r3)
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            throwCce(r2, r3)
        L1c:
            return r2
    }

    public static int getFunctionArity(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.FunctionBase
            if (r0 == 0) goto Lb
            kotlin.jvm.internal.FunctionBase r1 = (kotlin.jvm.internal.FunctionBase) r1
            int r1 = r1.getArity()
            return r1
        Lb:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function0
            if (r0 == 0) goto L11
            r1 = 0
            return r1
        L11:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function1
            if (r0 == 0) goto L17
            r1 = 1
            return r1
        L17:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function2
            if (r0 == 0) goto L1d
            r1 = 2
            return r1
        L1d:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function3
            if (r0 == 0) goto L23
            r1 = 3
            return r1
        L23:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function4
            if (r0 == 0) goto L29
            r1 = 4
            return r1
        L29:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function5
            if (r0 == 0) goto L2f
            r1 = 5
            return r1
        L2f:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function6
            if (r0 == 0) goto L35
            r1 = 6
            return r1
        L35:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function7
            if (r0 == 0) goto L3b
            r1 = 7
            return r1
        L3b:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function8
            if (r0 == 0) goto L42
            r1 = 8
            return r1
        L42:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function9
            if (r0 == 0) goto L49
            r1 = 9
            return r1
        L49:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function10
            if (r0 == 0) goto L50
            r1 = 10
            return r1
        L50:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function11
            if (r0 == 0) goto L57
            r1 = 11
            return r1
        L57:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function12
            if (r0 == 0) goto L5e
            r1 = 12
            return r1
        L5e:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function13
            if (r0 == 0) goto L65
            r1 = 13
            return r1
        L65:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function14
            if (r0 == 0) goto L6c
            r1 = 14
            return r1
        L6c:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function15
            if (r0 == 0) goto L73
            r1 = 15
            return r1
        L73:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function16
            if (r0 == 0) goto L7a
            r1 = 16
            return r1
        L7a:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function17
            if (r0 == 0) goto L81
            r1 = 17
            return r1
        L81:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function18
            if (r0 == 0) goto L88
            r1 = 18
            return r1
        L88:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function19
            if (r0 == 0) goto L8f
            r1 = 19
            return r1
        L8f:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function20
            if (r0 == 0) goto L96
            r1 = 20
            return r1
        L96:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function21
            if (r0 == 0) goto L9d
            r1 = 21
            return r1
        L9d:
            boolean r1 = r1 instanceof kotlin.jvm.functions.Function22
            if (r1 == 0) goto La4
            r1 = 22
            return r1
        La4:
            r1 = -1
            return r1
    }

    public static boolean isFunctionOfArity(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof kotlin.Function
            if (r0 == 0) goto Lc
            int r1 = getFunctionArity(r1)
            if (r1 != r2) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private static <T extends java.lang.Throwable> T sanitizeStackTrace(T r1) {
            java.lang.Class<kotlin.jvm.internal.TypeIntrinsics> r0 = kotlin.jvm.internal.TypeIntrinsics.class
            java.lang.String r0 = r0.getName()
            java.lang.Throwable r1 = kotlin.jvm.internal.Intrinsics.sanitizeStackTrace(r1, r0)
            return r1
    }

    public static java.lang.ClassCastException throwCce(java.lang.ClassCastException r0) {
            java.lang.Throwable r0 = sanitizeStackTrace(r0)
            java.lang.ClassCastException r0 = (java.lang.ClassCastException) r0
            throw r0
    }

    public static void throwCce(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be cast to "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            throwCce(r1)
            return
    }

    public static void throwCce(java.lang.String r1) {
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }
}
