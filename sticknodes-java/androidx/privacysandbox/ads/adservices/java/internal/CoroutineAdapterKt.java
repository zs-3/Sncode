package androidx.privacysandbox.ads.adservices.java.internal;

/* compiled from: CoroutineAdapter.kt */
/* loaded from: classes.dex */
public final class CoroutineAdapterKt {
    public static /* synthetic */ java.lang.Object $r8$lambda$aokAPp5is9J3T3N4O5WHpvbkswU(kotlinx.coroutines.Deferred r0, java.lang.Object r1, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r2) {
            java.lang.Object r0 = asListenableFuture$lambda$0(r0, r1, r2)
            return r0
    }

    public static final <T> com.google.common.util.concurrent.ListenableFuture<T> asListenableFuture(kotlinx.coroutines.Deferred<? extends T> r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$$ExternalSyntheticLambda0 r0 = new androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            com.google.common.util.concurrent.ListenableFuture r1 = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(r0)
            java.lang.String r2 = "getFuture { completer ->…      }\n        tag\n    }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture asListenableFuture$default(kotlinx.coroutines.Deferred r0, java.lang.Object r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "Deferred.asListenableFuture"
        L6:
            com.google.common.util.concurrent.ListenableFuture r0 = asListenableFuture(r0, r1)
            return r0
    }

    private static final java.lang.Object asListenableFuture$lambda$0(kotlinx.coroutines.Deferred r1, java.lang.Object r2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer r3) {
            java.lang.String r0 = "$this_asListenableFuture"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "completer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1 r0 = new androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt$asListenableFuture$1$1
            r0.<init>(r3, r1)
            r1.invokeOnCompletion(r0)
            return r2
    }
}
