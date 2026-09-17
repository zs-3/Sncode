package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfom extends com.google.android.gms.internal.ads.zzfoi {
    private final com.google.android.gms.internal.ads.zzfok zza;
    private final com.google.android.gms.internal.ads.zzfph zzb;
    private com.google.android.gms.internal.ads.zzfqs zzc;
    private com.google.android.gms.internal.ads.zzfpr zzd;
    private boolean zze;
    private boolean zzf;
    private final java.lang.String zzg;

    zzfom(com.google.android.gms.internal.ads.zzfoj r4, com.google.android.gms.internal.ads.zzfok r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            com.google.android.gms.internal.ads.zzfph r0 = new com.google.android.gms.internal.ads.zzfph
            r0.<init>()
            r3.zzb = r0
            r0 = 0
            r3.zze = r0
            r3.zzf = r0
            r3.zza = r5
            r3.zzg = r6
            r0 = 0
            r3.zzk(r0)
            com.google.android.gms.internal.ads.zzfol r1 = r5.zzd()
            com.google.android.gms.internal.ads.zzfol r2 = com.google.android.gms.internal.ads.zzfol.zza
            if (r1 == r2) goto L34
            com.google.android.gms.internal.ads.zzfol r1 = r5.zzd()
            com.google.android.gms.internal.ads.zzfol r2 = com.google.android.gms.internal.ads.zzfol.zzc
            if (r1 != r2) goto L28
            goto L34
        L28:
            com.google.android.gms.internal.ads.zzfpv r1 = new com.google.android.gms.internal.ads.zzfpv
            java.util.Map r5 = r5.zzi()
            r1.<init>(r6, r5, r0)
            r3.zzd = r1
            goto L3f
        L34:
            com.google.android.gms.internal.ads.zzfps r0 = new com.google.android.gms.internal.ads.zzfps
            android.webkit.WebView r5 = r5.zza()
            r0.<init>(r6, r5)
            r3.zzd = r0
        L3f:
            com.google.android.gms.internal.ads.zzfpr r5 = r3.zzd
            r5.zzn()
            com.google.android.gms.internal.ads.zzfpd r5 = com.google.android.gms.internal.ads.zzfpd.zza()
            r5.zzd(r3)
            com.google.android.gms.internal.ads.zzfpr r5 = r3.zzd
            r5.zzf(r4)
            return
    }

    private final void zzk(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqs r0 = new com.google.android.gms.internal.ads.zzfqs
            r0.<init>(r2)
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoi
    public final void zzb(android.view.View r2, com.google.android.gms.internal.ads.zzfop r3, java.lang.String r4) {
            r1 = this;
            boolean r4 = r1.zzf
            if (r4 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzfph r4 = r1.zzb
            java.lang.String r0 = "Ad overlay"
            r4.zzb(r2, r3, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoi
    public final void zzc() {
            r1 = this;
            boolean r0 = r1.zzf
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.internal.ads.zzfqs r0 = r1.zzc
            r0.clear()
            boolean r0 = r1.zzf
            if (r0 != 0) goto L13
            com.google.android.gms.internal.ads.zzfph r0 = r1.zzb
            r0.zzc()
        L13:
            r0 = 1
            r1.zzf = r0
            com.google.android.gms.internal.ads.zzfpr r0 = r1.zzd
            r0.zze()
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzfpr r0 = r1.zzd
            r0.zzc()
            r0 = 0
            r1.zzd = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoi
    public final void zzd(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.zzf
            if (r0 == 0) goto L5
            goto L41
        L5:
            android.view.View r0 = r3.zzf()
            if (r0 == r4) goto L41
            r3.zzk(r4)
            com.google.android.gms.internal.ads.zzfpr r0 = r3.zzd
            r0.zzb()
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            java.util.Collection r0 = r0.zzc()
            if (r0 == 0) goto L41
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L41
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.ads.zzfom r1 = (com.google.android.gms.internal.ads.zzfom) r1
            if (r1 == r3) goto L27
            android.view.View r2 = r1.zzf()
            if (r2 != r4) goto L27
            com.google.android.gms.internal.ads.zzfqs r1 = r1.zzc
            r1.clear()
            goto L27
        L41:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfoi
    public final void zze() {
            r2 = this;
            boolean r0 = r2.zze
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.zze = r0
            com.google.android.gms.internal.ads.zzfpd r0 = com.google.android.gms.internal.ads.zzfpd.zza()
            r0.zzf(r2)
            com.google.android.gms.internal.ads.zzfpl r0 = com.google.android.gms.internal.ads.zzfpl.zzb()
            float r0 = r0.zza()
            com.google.android.gms.internal.ads.zzfpr r1 = r2.zzd
            r1.zzl(r0)
            com.google.android.gms.internal.ads.zzfpr r0 = r2.zzd
            com.google.android.gms.internal.ads.zzfpb r1 = com.google.android.gms.internal.ads.zzfpb.zza()
            java.util.Date r1 = r1.zzb()
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzfpr r0 = r2.zzd
            com.google.android.gms.internal.ads.zzfok r1 = r2.zza
            r0.zzi(r2, r1)
            return
    }

    public final android.view.View zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfqs r0 = r1.zzc
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfpr zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfpr r0 = r1.zzd
            return r0
    }

    public final java.lang.String zzh() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    public final java.util.List zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfph r0 = r1.zzb
            java.util.List r0 = r0.zza()
            return r0
    }

    public final boolean zzj() {
            r1 = this;
            boolean r0 = r1.zze
            if (r0 == 0) goto La
            boolean r0 = r1.zzf
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
