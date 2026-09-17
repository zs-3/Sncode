package androidx.privacysandbox.ads.adservices.java.topics;

/* compiled from: TopicsManagerFutures.kt */
/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Companion Companion = null;

    /* compiled from: TopicsManagerFutures.kt */
    private static final class CommonApiJavaImpl extends androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures {
        private final androidx.privacysandbox.ads.adservices.topics.TopicsManager mTopicsManager;

        public CommonApiJavaImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManager r2) {
                r1 = this;
                java.lang.String r0 = "mTopicsManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.mTopicsManager = r2
                return
        }

        public static final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.TopicsManager access$getMTopicsManager$p(androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.CommonApiJavaImpl r0) {
                androidx.privacysandbox.ads.adservices.topics.TopicsManager r0 = r0.mTopicsManager
                return r0
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r8) {
                r7 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
                kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r0)
                androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1 r4 = new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl$getTopicsAsync$1
                r0 = 0
                r4.<init>(r7, r8, r0)
                r2 = 0
                r3 = 0
                r5 = 3
                r6 = 0
                kotlinx.coroutines.Deferred r8 = kotlinx.coroutines.BuildersKt.async$default(r1, r2, r3, r4, r5, r6)
                r1 = 1
                com.google.common.util.concurrent.ListenableFuture r8 = androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt.asListenableFuture$default(r8, r0, r1, r0)
                return r8
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures from(android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion r0 = androidx.privacysandbox.ads.adservices.topics.TopicsManager.Companion
                androidx.privacysandbox.ads.adservices.topics.TopicsManager r2 = r0.obtain(r2)
                if (r2 == 0) goto L13
                androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl r0 = new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$CommonApiJavaImpl
                r0.<init>(r2)
                goto L14
            L13:
                r0 = 0
            L14:
                return r0
        }
    }

    static {
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Companion r0 = new androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Companion = r0
            return
    }

    public TopicsManagerFutures() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures from(android.content.Context r1) {
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Companion r0 = androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures.Companion
            androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures r1 = r0.from(r1)
            return r1
    }

    public abstract com.google.common.util.concurrent.ListenableFuture<androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> getTopicsAsync(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r1);
}
