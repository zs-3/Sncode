package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbnc implements com.google.android.gms.internal.ads.zzbmu, com.google.android.gms.internal.ads.zzbmt {
    private final com.google.android.gms.internal.ads.zzcfo zza;

    public zzbnc(android.content.Context r17, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r18, com.google.android.gms.internal.ads.zzavn r19, com.google.android.gms.ads.internal.zza r20) throws com.google.android.gms.internal.ads.zzcga {
            r16 = this;
            r16.<init>()
            com.google.android.gms.ads.internal.zzu.zzz()
            com.google.android.gms.internal.ads.zzchi r1 = com.google.android.gms.internal.ads.zzchi.zza()
            com.google.android.gms.internal.ads.zzbbu r11 = com.google.android.gms.internal.ads.zzbbu.zza()
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r17
            r7 = r18
            com.google.android.gms.internal.ads.zzcfo r0 = com.google.android.gms.internal.ads.zzcgb.zza(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r16
            r1.zza = r0
            android.view.View r0 = r0.zzF()
            r2 = 1
            r0.setWillNotDraw(r2)
            return
    }

    private static final void zzs(java.lang.Runnable r1) {
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.zzv()
            if (r0 == 0) goto L12
            java.lang.String r0 = "runOnUiThread > the UI thread is the main thread, the runnable will be run now"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r1.run()
            return
        L12:
            java.lang.String r0 = "runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzfun r0 = com.google.android.gms.ads.internal.util.zzt.zza
            boolean r1 = r0.post(r1)
            if (r1 != 0) goto L24
            java.lang.String r1 = "runOnUiThread > the runnable could not be placed to the message queue"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
        L24:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zza(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "invokeJavascript on adWebView from js"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbmy r0 = new com.google.android.gms.internal.ads.zzbmy
            r0.<init>(r1, r2)
            zzs(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void zzb(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzc(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.destroy()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void zzd(java.lang.String r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zza(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmr
    public final /* synthetic */ void zze(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzb(r0, r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzf(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "loadHtml on adWebView from html"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbmz r0 = new com.google.android.gms.internal.ads.zzbmz
            r0.<init>(r1, r2)
            zzs(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzg(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "loadHtmlWrapper on adWebView from path: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            com.google.android.gms.internal.ads.zzbmw r0 = new com.google.android.gms.internal.ads.zzbmw
            r0.<init>(r2, r3)
            zzs(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzh(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "loadJavascript on adWebView from path: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            com.google.android.gms.internal.ads.zzbna r0 = new com.google.android.gms.internal.ads.zzbna
            r0.<init>(r2, r3)
            zzs(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final boolean zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            boolean r0 = r0.zzaE()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final com.google.android.gms.internal.ads.zzbob zzj() {
            r1 = this;
            com.google.android.gms.internal.ads.zzbob r0 = new com.google.android.gms.internal.ads.zzbob
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzbmu
    public final void zzk(com.google.android.gms.internal.ads.zzbni r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r2.zza
            com.google.android.gms.internal.ads.zzchg r0 = r0.zzN()
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzbmx r1 = new com.google.android.gms.internal.ads.zzbmx
            r1.<init>(r3)
            r0.zzH(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final /* synthetic */ void zzl(java.lang.String r1, org.json.JSONObject r2) {
            r0 = this;
            com.google.android.gms.internal.ads.zzbms.zzd(r0, r1, r2)
            return
    }

    final /* synthetic */ void zzm(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            r0.zza(r2)
            return
    }

    final /* synthetic */ void zzn(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zza
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            UX.aTqO5.a()
            return
    }

    final /* synthetic */ void zzo(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zza
            UX.aTqO5.a()
            return
    }

    final /* synthetic */ void zzp(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zza
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            UX.aTqO5.a()
            return
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void zzq(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbnb r0 = new com.google.android.gms.internal.ads.zzbnb
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zza
            r3.zzag(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzboa
    public final void zzr(java.lang.String r2, com.google.android.gms.internal.ads.zzbjw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbmv r0 = new com.google.android.gms.internal.ads.zzbmv
            r0.<init>(r3)
            com.google.android.gms.internal.ads.zzcfo r3 = r1.zza
            r3.zzaA(r2, r0)
            return
    }
}
