package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhz {
    public static void zza(android.content.Context r1, boolean r2) {
            if (r2 == 0) goto L8
            java.lang.String r1 = "This request is sent from a test device."
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
        L8:
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            java.lang.String r1 = com.google.android.gms.ads.internal.util.client.zzf.zzz(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\""
            r2.append(r0)
            r2.append(r1)
            java.lang.String r1 = "\")) to get test ads on this device."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r1)
            return
    }

    public static void zzb(int r2, java.lang.Throwable r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ad failed to load : "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzi(r0)
            com.google.android.gms.ads.internal.util.zze.zzb(r4, r3)
            r0 = 3
            if (r2 != r0) goto L1b
            return
        L1b:
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
            r2.zzv(r3, r4)
            return
    }
}
