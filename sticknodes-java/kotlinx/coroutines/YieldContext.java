package kotlinx.coroutines;

/* compiled from: Unconfined.kt */
/* loaded from: classes2.dex */
public final class YieldContext extends kotlin.coroutines.AbstractCoroutineContextElement {
    public static final kotlinx.coroutines.YieldContext.Key Key = null;
    public boolean dispatcherWasUnconfined;

    /* compiled from: Unconfined.kt */
    public static final class Key implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.YieldContext> {
        private Key() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Key(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.YieldContext$Key r0 = new kotlinx.coroutines.YieldContext$Key
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.YieldContext.Key = r0
            return
    }

    public YieldContext() {
            r1 = this;
            kotlinx.coroutines.YieldContext$Key r0 = kotlinx.coroutines.YieldContext.Key
            r1.<init>(r0)
            return
    }
}
