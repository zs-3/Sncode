package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdzf implements com.google.android.gms.internal.ads.zzgfk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzdzg zza;

    zzdzf(com.google.android.gms.internal.ads.zzdzg r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zza(java.lang.Throwable r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzdzg.zzd()
            java.lang.String r3 = r3.getMessage()
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L36
            r0 = 1
            java.lang.String r3 = r3.group(r0)
            com.google.android.gms.internal.ads.zzdzg r0 = r2.zza
            com.google.android.gms.internal.ads.zzedu r0 = com.google.android.gms.internal.ads.zzdzg.zza(r0)
            int r3 = java.lang.Integer.parseInt(r3)
            r0.zzi(r3)
        L36:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzfgt r4 = (com.google.android.gms.internal.ads.zzfgt) r4
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzfX
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzdzg r0 = r3.zza
            com.google.android.gms.internal.ads.zzedu r0 = com.google.android.gms.internal.ads.zzdzg.zza(r0)
            com.google.android.gms.internal.ads.zzfgs r1 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r1 = r1.zzb
            int r1 = r1.zzf
            r0.zzi(r1)
            com.google.android.gms.internal.ads.zzdzg r0 = r3.zza
            com.google.android.gms.internal.ads.zzedu r0 = com.google.android.gms.internal.ads.zzdzg.zza(r0)
            com.google.android.gms.internal.ads.zzfgs r4 = r4.zzb
            com.google.android.gms.internal.ads.zzfgk r4 = r4.zzb
            long r1 = r4.zzg
            r0.zzj(r1)
        L32:
            return
    }
}
