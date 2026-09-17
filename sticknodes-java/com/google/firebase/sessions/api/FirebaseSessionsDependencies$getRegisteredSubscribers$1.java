package com.google.firebase.sessions.api;

/* compiled from: FirebaseSessionsDependencies.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
/* loaded from: classes2.dex */
final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.api.FirebaseSessionsDependencies this$0;

    FirebaseSessionsDependencies$getRegisteredSubscribers$1(com.google.firebase.sessions.api.FirebaseSessionsDependencies r1, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1> r2) {
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
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r2 = r1.this$0
            java.lang.Object r2 = r2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r1)
            return r2
    }
}
