package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeen extends com.google.android.gms.internal.ads.zzefk {
    private android.app.Activity zza;
    private com.google.android.gms.ads.internal.overlay.zzm zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;

    zzeen() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final com.google.android.gms.internal.ads.zzefk zza(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = "Null activity"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final com.google.android.gms.internal.ads.zzefk zzb(com.google.android.gms.ads.internal.overlay.zzm r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final com.google.android.gms.internal.ads.zzefk zzc(java.lang.String r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final com.google.android.gms.internal.ads.zzefk zzd(java.lang.String r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzefk
    public final com.google.android.gms.internal.ads.zzefl zze() {
            r7 = this;
            android.app.Activity r1 = r7.zza
            if (r1 == 0) goto L12
            com.google.android.gms.internal.ads.zzeep r6 = new com.google.android.gms.internal.ads.zzeep
            com.google.android.gms.ads.internal.overlay.zzm r2 = r7.zzb
            java.lang.String r3 = r7.zzc
            java.lang.String r4 = r7.zzd
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties: activity"
            r0.<init>(r1)
            throw r0
    }
}
