package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgrx implements com.google.android.gms.internal.ads.zzgqq {
    private static final com.google.android.gms.internal.ads.zzgrx zza = null;

    static {
            com.google.android.gms.internal.ads.zzgrx r0 = new com.google.android.gms.internal.ads.zzgrx
            r0.<init>()
            com.google.android.gms.internal.ads.zzgrx.zza = r0
            return
    }

    private zzgrx() {
            r0 = this;
            r0.<init>()
            return
    }

    static void zzd() throws java.security.GeneralSecurityException {
            com.google.android.gms.internal.ads.zzgpn r0 = com.google.android.gms.internal.ads.zzgpn.zza()
            com.google.android.gms.internal.ads.zzgrx r1 = com.google.android.gms.internal.ads.zzgrx.zza
            r0.zzf(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final java.lang.Class zza() {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgru> r0 = com.google.android.gms.internal.ads.zzgru.class
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final java.lang.Class zzb() {
            r1 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzgru> r0 = com.google.android.gms.internal.ads.zzgru.class
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgqq
    public final /* bridge */ /* synthetic */ java.lang.Object zzc(com.google.android.gms.internal.ads.zzgqp r4) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.android.gms.internal.ads.zzgqn r0 = r4.zzc()
            if (r0 == 0) goto L38
            java.util.Collection r0 = r4.zze()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzgqn r2 = (com.google.android.gms.internal.ads.zzgqn) r2
            java.lang.Object r2 = r2.zzd()
            com.google.android.gms.internal.ads.zzgru r2 = (com.google.android.gms.internal.ads.zzgru) r2
            goto L1e
        L31:
            com.google.android.gms.internal.ads.zzgrw r0 = new com.google.android.gms.internal.ads.zzgrw
            r1 = 0
            r0.<init>(r4, r1)
            return r0
        L38:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r0 = "no primary in primitive set"
            r4.<init>(r0)
            throw r4
    }
}
