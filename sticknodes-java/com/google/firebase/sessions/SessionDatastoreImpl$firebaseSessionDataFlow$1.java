package com.google.firebase.sessions;

/* compiled from: SessionDatastore.kt */
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super androidx.datastore.preferences.core.Preferences>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    SessionDatastoreImpl$firebaseSessionDataFlow$1(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1> r2) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super androidx.datastore.preferences.core.Preferences> r1, java.lang.Throwable r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke2(r1, r2, r3)
            return r1
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.flow.FlowCollector<? super androidx.datastore.preferences.core.Preferences> r2, java.lang.Throwable r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1
            r0.<init>(r4)
            r0.L$0 = r2
            r0.L$1 = r3
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r0.invokeSuspend(r2)
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L39
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.lang.Object r1 = r5.L$1
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.String r3 = "FirebaseSessionsRepo"
            java.lang.String r4 = "Error reading stored session data."
            android.util.Log.e(r3, r4, r1)
            androidx.datastore.preferences.core.Preferences r1 = androidx.datastore.preferences.core.PreferencesFactory.createEmpty()
            r3 = 0
            r5.L$0 = r3
            r5.label = r2
            java.lang.Object r6 = r6.emit(r1, r5)
            if (r6 != r0) goto L39
            return r0
        L39:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
