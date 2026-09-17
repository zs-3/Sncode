package com.google.firebase.sessions;

/* compiled from: InstallationId.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
/* loaded from: classes2.dex */
final class InstallationId$Companion$create$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.InstallationId.Companion this$0;

    InstallationId$Companion$create$1(com.google.firebase.sessions.InstallationId.Companion r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.InstallationId$Companion$create$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.google.firebase.sessions.InstallationId$Companion r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.create(r0, r1)
            return r2
    }
}
