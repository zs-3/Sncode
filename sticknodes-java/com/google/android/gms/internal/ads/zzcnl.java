package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcnl implements com.google.android.gms.internal.ads.zzcnf {
    private final com.google.android.gms.internal.ads.zzdxb zza;

    zzcnl(com.google.android.gms.internal.ads.zzdxb r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzcnf
    public final void zza(java.util.Map r4) {
            r3 = this;
            java.lang.String r0 = "gesture"
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto Lf
            return
        Lf:
            int r0 = r4.hashCode()
            r1 = 97520651(0x5d00c0b, float:1.956465E-35)
            r2 = 1
            if (r0 == r1) goto L29
            r1 = 109399814(0x6854f06, float:5.0145154E-35)
            if (r0 == r1) goto L1f
            goto L33
        L1f:
            java.lang.String r0 = "shake"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 0
            goto L34
        L29:
            java.lang.String r0 = "flick"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = -1
        L34:
            if (r4 == 0) goto L48
            if (r4 == r2) goto L40
            com.google.android.gms.internal.ads.zzdxb r4 = r3.zza
            com.google.android.gms.internal.ads.zzdwx r0 = com.google.android.gms.internal.ads.zzdwx.zza
            r4.zzm(r0)
            return
        L40:
            com.google.android.gms.internal.ads.zzdxb r4 = r3.zza
            com.google.android.gms.internal.ads.zzdwx r0 = com.google.android.gms.internal.ads.zzdwx.zzc
            r4.zzm(r0)
            return
        L48:
            com.google.android.gms.internal.ads.zzdxb r4 = r3.zza
            com.google.android.gms.internal.ads.zzdwx r0 = com.google.android.gms.internal.ads.zzdwx.zzb
            r4.zzm(r0)
            return
    }
}
