package androidx.core.net;

/* loaded from: classes.dex */
public final class ConnectivityManagerCompat {

    static class Api16Impl {
        static boolean isActiveNetworkMetered(android.net.ConnectivityManager r0) {
                boolean r0 = r0.isActiveNetworkMetered()
                return r0
        }
    }

    public static boolean isActiveNetworkMetered(android.net.ConnectivityManager r0) {
            boolean r0 = androidx.core.net.ConnectivityManagerCompat.Api16Impl.isActiveNetworkMetered(r0)
            return r0
    }
}
