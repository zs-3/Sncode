package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
/* loaded from: classes2.dex */
public interface Channel<E> extends kotlinx.coroutines.channels.SendChannel<E>, kotlinx.coroutines.channels.ReceiveChannel<E> {
    public static final kotlinx.coroutines.channels.Channel.Factory Factory = null;

    /* compiled from: Channel.kt */
    public static final class Factory {
        static final /* synthetic */ kotlinx.coroutines.channels.Channel.Factory $$INSTANCE = null;
        private static final int CHANNEL_DEFAULT_CAPACITY = 0;

        static {
                kotlinx.coroutines.channels.Channel$Factory r0 = new kotlinx.coroutines.channels.Channel$Factory
                r0.<init>()
                kotlinx.coroutines.channels.Channel.Factory.$$INSTANCE = r0
                java.lang.String r0 = "kotlinx.coroutines.channels.defaultBuffer"
                r1 = 64
                r2 = 1
                r3 = 2147483646(0x7ffffffe, float:NaN)
                int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1, r2, r3)
                kotlinx.coroutines.channels.Channel.Factory.CHANNEL_DEFAULT_CAPACITY = r0
                return
        }

        private Factory() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
                r1 = this;
                int r0 = kotlinx.coroutines.channels.Channel.Factory.CHANNEL_DEFAULT_CAPACITY
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory.$$INSTANCE
            kotlinx.coroutines.channels.Channel.Factory = r0
            return
    }
}
