package com.google.firebase.crashlytics.internal.concurrency;

/* compiled from: CrashlyticsWorkers.kt */
/* loaded from: classes2.dex */
/* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.lang.Boolean> {
    CrashlyticsWorkers$Companion$checkBlockingThread$1(java.lang.Object r8) {
            r7 = this;
            java.lang.Class<com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion> r3 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion.class
            r1 = 0
            java.lang.String r4 = "isBlockingThread"
            java.lang.String r5 = "isBlockingThread()Z"
            r6 = 0
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Boolean invoke() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers$Companion r0 = (com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion) r0
            boolean r0 = com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers.Companion.access$isBlockingThread(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke() {
            r1 = this;
            java.lang.Boolean r0 = r1.invoke()
            return r0
    }
}
