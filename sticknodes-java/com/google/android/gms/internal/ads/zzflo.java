package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzflo {
    public static com.google.android.gms.internal.ads.zzflp zza(android.content.Context r2, int r3) {
            boolean r0 = com.google.android.gms.internal.ads.zzfmd.zza()
            if (r0 == 0) goto L4f
            int r0 = r3 + (-2)
            r1 = 20
            if (r0 == r1) goto L3b
            r1 = 21
            if (r0 == r1) goto L3b
            switch(r0) {
                case 2: goto L2e;
                case 3: goto L2e;
                case 4: goto L21;
                case 5: goto L14;
                case 6: goto L2e;
                case 7: goto L2e;
                case 8: goto L2e;
                case 9: goto L21;
                case 10: goto L21;
                case 11: goto L21;
                case 12: goto L21;
                case 13: goto L21;
                default: goto L13;
            }
        L13:
            goto L4f
        L14:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzb
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L47
        L21:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzd
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L47
        L2e:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zzc
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L47
        L3b:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbek.zze
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L47:
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzflr r0 = new com.google.android.gms.internal.ads.zzflr
            r0.<init>(r2, r3)
            return r0
        L4f:
            com.google.android.gms.internal.ads.zzfmt r2 = new com.google.android.gms.internal.ads.zzfmt
            r2.<init>()
            return r2
    }

    public static com.google.android.gms.internal.ads.zzflp zzb(android.content.Context r0, int r1, int r2, com.google.android.gms.ads.internal.client.zzm r3) {
            com.google.android.gms.internal.ads.zzflp r0 = zza(r0, r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzflr
            if (r1 != 0) goto L9
            goto L25
        L9:
            r0.zzi()
            r0.zzn(r2)
            android.os.Bundle r1 = r3.zzm
            com.google.android.gms.internal.ads.zzfmg r1 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(r1)
            r0.zzf(r1)
            java.lang.String r1 = r3.zzp
            boolean r1 = com.google.android.gms.internal.ads.zzflz.zze(r1)
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.zzp
            r0.zze(r1)
        L25:
            return r0
    }
}
