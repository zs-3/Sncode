package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: TopicsManager.kt */
/* loaded from: classes.dex */
public abstract class TopicsManager {
    public static final androidx.privacysandbox.ads.adservices.topics.TopicsManager.Companion Companion = null;

    /* compiled from: TopicsManager.kt */
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

        @android.annotation.SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final androidx.privacysandbox.ads.adservices.topics.TopicsManager obtain(android.content.Context r5) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.privacysandbox.ads.adservices.internal.AdServicesInfo r0 = androidx.privacysandbox.ads.adservices.internal.AdServicesInfo.INSTANCE
                int r1 = r0.adServicesVersion()
                r2 = 11
                if (r1 < r2) goto L15
                androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext11Impl r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext11Impl
                r0.<init>(r5)
                goto L5e
            L15:
                int r1 = r0.adServicesVersion()
                r3 = 5
                if (r1 < r3) goto L22
                androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext5Impl r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext5Impl
                r0.<init>(r5)
                goto L5e
            L22:
                int r1 = r0.adServicesVersion()
                r3 = 4
                if (r1 != r3) goto L2f
                androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext4Impl r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext4Impl
                r0.<init>(r5)
                goto L5e
            L2f:
                int r1 = r0.extServicesVersionS()
                java.lang.String r3 = "TopicsManager"
                if (r1 < r2) goto L46
                androidx.privacysandbox.ads.adservices.internal.BackCompatManager r0 = androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE
                androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$1 r1 = new androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$1
                r1.<init>(r5)
                java.lang.Object r5 = r0.getManager(r5, r3, r1)
                r0 = r5
                androidx.privacysandbox.ads.adservices.topics.TopicsManager r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManager) r0
                goto L5e
            L46:
                int r0 = r0.extServicesVersionS()
                r1 = 9
                if (r0 < r1) goto L5d
                androidx.privacysandbox.ads.adservices.internal.BackCompatManager r0 = androidx.privacysandbox.ads.adservices.internal.BackCompatManager.INSTANCE
                androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$2 r1 = new androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$2
                r1.<init>(r5)
                java.lang.Object r5 = r0.getManager(r5, r3, r1)
                r0 = r5
                androidx.privacysandbox.ads.adservices.topics.TopicsManager r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManager) r0
                goto L5e
            L5d:
                r0 = 0
            L5e:
                return r0
        }
    }

    static {
            androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.privacysandbox.ads.adservices.topics.TopicsManager.Companion = r0
            return
    }

    public TopicsManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract java.lang.Object getTopics(androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r1, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r2);
}
