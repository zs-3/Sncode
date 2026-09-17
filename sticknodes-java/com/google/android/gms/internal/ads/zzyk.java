package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzyk {
    public final com.google.android.gms.internal.ads.zzcd zza;
    public final int[] zzb;

    public zzyk(com.google.android.gms.internal.ads.zzcd r3, int[] r4, int r5) {
            r2 = this;
            r2.<init>()
            int r5 = r4.length
            if (r5 != 0) goto L12
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            java.lang.String r0 = "ETSDefinition"
            java.lang.String r1 = "Empty tracks are not allowed"
            com.google.android.gms.internal.ads.zzea.zzd(r0, r1, r5)
        L12:
            r2.zza = r3
            r2.zzb = r4
            return
    }
}
