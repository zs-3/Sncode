package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfdm {
    public static void zza(java.util.concurrent.atomic.AtomicReference r0, com.google.android.gms.internal.ads.zzfdl r1) {
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L7
            return
        L7:
            r1.zza(r0)     // Catch: java.lang.NullPointerException -> Lb android.os.RemoteException -> L12
            return
        Lb:
            r0 = move-exception
            java.lang.String r1 = "NullPointerException occurs when invoking a method from a delegating listener."
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            return
        L12:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.zzl(r1, r0)
            return
    }
}
