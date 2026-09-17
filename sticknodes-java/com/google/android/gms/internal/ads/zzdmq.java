package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdmq implements com.google.android.gms.internal.ads.zzdkx {
    private final com.google.android.gms.internal.ads.zzbqa zza;
    private final com.google.android.gms.internal.ads.zzcys zzb;
    private final com.google.android.gms.internal.ads.zzcxy zzc;
    private final com.google.android.gms.internal.ads.zzdfy zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzfgh zzf;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzg;
    private final com.google.android.gms.internal.ads.zzfhc zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private final com.google.android.gms.internal.ads.zzbpw zzl;
    private final com.google.android.gms.internal.ads.zzbpx zzm;

    public zzdmq(com.google.android.gms.internal.ads.zzbpw r2, com.google.android.gms.internal.ads.zzbpx r3, com.google.android.gms.internal.ads.zzbqa r4, com.google.android.gms.internal.ads.zzcys r5, com.google.android.gms.internal.ads.zzcxy r6, com.google.android.gms.internal.ads.zzdfy r7, android.content.Context r8, com.google.android.gms.internal.ads.zzfgh r9, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r10, com.google.android.gms.internal.ads.zzfhc r11) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzi = r0
            r1.zzj = r0
            r0 = 1
            r1.zzk = r0
            r1.zzl = r2
            r1.zzm = r3
            r1.zza = r4
            r1.zzb = r5
            r1.zzc = r6
            r1.zzd = r7
            r1.zze = r8
            r1.zzf = r9
            r1.zzg = r10
            r1.zzh = r11
            return
    }

    private final void zzb(android.view.View r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbqa r0 = r1.zza     // Catch: android.os.RemoteException -> L90
            if (r0 == 0) goto L30
            boolean r0 = r0.zzA()     // Catch: android.os.RemoteException -> L90
            if (r0 != 0) goto L30
            com.google.android.gms.internal.ads.zzbqa r0 = r1.zza     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L90
            r0.zzw(r2)     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzcxy r2 = r1.zzc     // Catch: android.os.RemoteException -> L90
            r2.onAdClicked()     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkr     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L90
            java.lang.Object r2 = r0.zza(r2)     // Catch: android.os.RemoteException -> L90
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: android.os.RemoteException -> L90
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L90
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzdfy r2 = r1.zzd     // Catch: android.os.RemoteException -> L90
            r2.zzdG()     // Catch: android.os.RemoteException -> L90
            return
        L30:
            com.google.android.gms.internal.ads.zzbpw r0 = r1.zzl     // Catch: android.os.RemoteException -> L90
            if (r0 == 0) goto L60
            boolean r0 = r0.zzx()     // Catch: android.os.RemoteException -> L90
            if (r0 != 0) goto L60
            com.google.android.gms.internal.ads.zzbpw r0 = r1.zzl     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L90
            r0.zzs(r2)     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzcxy r2 = r1.zzc     // Catch: android.os.RemoteException -> L90
            r2.onAdClicked()     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkr     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L90
            java.lang.Object r2 = r0.zza(r2)     // Catch: android.os.RemoteException -> L90
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: android.os.RemoteException -> L90
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L90
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzdfy r2 = r1.zzd     // Catch: android.os.RemoteException -> L90
            r2.zzdG()     // Catch: android.os.RemoteException -> L90
            return
        L60:
            com.google.android.gms.internal.ads.zzbpx r0 = r1.zzm     // Catch: android.os.RemoteException -> L90
            if (r0 == 0) goto L8f
            boolean r0 = r0.zzv()     // Catch: android.os.RemoteException -> L90
            if (r0 != 0) goto L8f
            com.google.android.gms.internal.ads.zzbpx r0 = r1.zzm     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch: android.os.RemoteException -> L90
            r0.zzq(r2)     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzcxy r2 = r1.zzc     // Catch: android.os.RemoteException -> L90
            r2.onAdClicked()     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzkr     // Catch: android.os.RemoteException -> L90
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L90
            java.lang.Object r2 = r0.zza(r2)     // Catch: android.os.RemoteException -> L90
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: android.os.RemoteException -> L90
            boolean r2 = r2.booleanValue()     // Catch: android.os.RemoteException -> L90
            if (r2 == 0) goto L8f
            com.google.android.gms.internal.ads.zzdfy r2 = r1.zzd     // Catch: android.os.RemoteException -> L90
            r2.zzdG()     // Catch: android.os.RemoteException -> L90
        L8f:
            return
        L90:
            r2 = move-exception
            java.lang.String r0 = "Failed to call handleClick"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r0, r2)
            return
    }

    private static final java.util.HashMap zzc(java.util.Map r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 != 0) goto L8
            goto L36
        L8:
            monitor-enter(r4)
            java.util.Set r1 = r4.entrySet()     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L37
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L37
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L37
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L11
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L37
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L37
            goto L11
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
        L36:
            return r0
        L37:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzA() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzB() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgh r0 = r1.zzf
            boolean r0 = r0.zzL
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final boolean zzC(android.os.Bundle r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final int zza() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final org.json.JSONObject zze(android.view.View r1, java.util.Map r2, java.util.Map r3, android.widget.ImageView.ScaleType r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final org.json.JSONObject zzf(android.view.View r1, java.util.Map r2, java.util.Map r3, android.widget.ImageView.ScaleType r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzg() {
            r1 = this;
            java.lang.String r0 = "Mute This Ad is not supported for 3rd party ads"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzh() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzi() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzj(com.google.android.gms.ads.internal.client.zzdh r1) {
            r0 = this;
            java.lang.String r1 = "Mute This Ad is not supported for 3rd party ads"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzk(android.view.View r1, android.view.View r2, java.util.Map r3, java.util.Map r4, boolean r5, android.widget.ImageView.ScaleType r6) {
            r0 = this;
            boolean r2 = r0.zzj
            if (r2 == 0) goto Lb
            com.google.android.gms.internal.ads.zzfgh r2 = r0.zzf
            boolean r2 = r2.zzL
            if (r2 == 0) goto Lb
            return
        Lb:
            r0.zzb(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzl(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzm(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzo(android.view.View r1, android.view.View r2, java.util.Map r3, java.util.Map r4, boolean r5, android.widget.ImageView.ScaleType r6, int r7) {
            r0 = this;
            boolean r1 = r0.zzj
            if (r1 != 0) goto La
            java.lang.String r1 = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        La:
            com.google.android.gms.internal.ads.zzfgh r1 = r0.zzf
            boolean r1 = r1.zzL
            if (r1 != 0) goto L16
            java.lang.String r1 = "Custom click reporting for 3p ads failed. Ad unit id not in allow list."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
        L16:
            r0.zzb(r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzp() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzq(android.view.View r2, java.util.Map r3, java.util.Map r4, android.widget.ImageView.ScaleType r5) {
            r1 = this;
            boolean r2 = r1.zzi     // Catch: android.os.RemoteException -> L64
            if (r2 != 0) goto L20
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzu.zzs()     // Catch: android.os.RemoteException -> L64
            android.content.Context r3 = r1.zze     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r1.zzg     // Catch: android.os.RemoteException -> L64
            java.lang.String r4 = r4.afmaVersion     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.internal.ads.zzfgh r5 = r1.zzf     // Catch: android.os.RemoteException -> L64
            org.json.JSONObject r5 = r5.zzC     // Catch: android.os.RemoteException -> L64
            java.lang.String r5 = r5.toString()     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzh     // Catch: android.os.RemoteException -> L64
            java.lang.String r0 = r0.zzf     // Catch: android.os.RemoteException -> L64
            boolean r2 = r2.zzn(r3, r4, r5, r0)     // Catch: android.os.RemoteException -> L64
            r1.zzi = r2     // Catch: android.os.RemoteException -> L64
        L20:
            boolean r2 = r1.zzk     // Catch: android.os.RemoteException -> L64
            if (r2 != 0) goto L25
            goto L63
        L25:
            com.google.android.gms.internal.ads.zzbqa r2 = r1.zza     // Catch: android.os.RemoteException -> L64
            if (r2 == 0) goto L3a
            boolean r2 = r2.zzB()     // Catch: android.os.RemoteException -> L64
            if (r2 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbqa r2 = r1.zza     // Catch: android.os.RemoteException -> L64
            r2.zzx()     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.internal.ads.zzcys r2 = r1.zzb     // Catch: android.os.RemoteException -> L64
            r2.zza()     // Catch: android.os.RemoteException -> L64
            return
        L3a:
            com.google.android.gms.internal.ads.zzbpw r2 = r1.zzl     // Catch: android.os.RemoteException -> L64
            if (r2 == 0) goto L4f
            boolean r2 = r2.zzy()     // Catch: android.os.RemoteException -> L64
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.zzbpw r2 = r1.zzl     // Catch: android.os.RemoteException -> L64
            r2.zzt()     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.internal.ads.zzcys r2 = r1.zzb     // Catch: android.os.RemoteException -> L64
            r2.zza()     // Catch: android.os.RemoteException -> L64
            return
        L4f:
            com.google.android.gms.internal.ads.zzbpx r2 = r1.zzm     // Catch: android.os.RemoteException -> L64
            if (r2 == 0) goto L63
            boolean r2 = r2.zzw()     // Catch: android.os.RemoteException -> L64
            if (r2 != 0) goto L63
            com.google.android.gms.internal.ads.zzbpx r2 = r1.zzm     // Catch: android.os.RemoteException -> L64
            r2.zzr()     // Catch: android.os.RemoteException -> L64
            com.google.android.gms.internal.ads.zzcys r2 = r1.zzb     // Catch: android.os.RemoteException -> L64
            r2.zza()     // Catch: android.os.RemoteException -> L64
        L63:
            return
        L64:
            r2 = move-exception
            java.lang.String r3 = "Failed to call recordImpression"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzr() {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzs(android.view.View r1, android.view.MotionEvent r2, android.view.View r3) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzt(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzu(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzv() {
            r1 = this;
            r0 = 1
            r1.zzj = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzw(com.google.android.gms.ads.internal.client.zzdd r1) {
            r0 = this;
            java.lang.String r1 = "Mute This Ad is not supported for 3rd party ads"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzx(com.google.android.gms.internal.ads.zzbhw r1) {
            r0 = this;
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzy(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzfgh r12 = r8.zzf     // Catch: android.os.RemoteException -> L124
            org.json.JSONObject r12 = r12.zzaj     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbcm r13 = com.google.android.gms.internal.ads.zzbcv.zzbA     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L124
            java.lang.Object r13 = r0.zza(r13)     // Catch: android.os.RemoteException -> L124
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: android.os.RemoteException -> L124
            boolean r13 = r13.booleanValue()     // Catch: android.os.RemoteException -> L124
            r0 = 1
            r1 = 0
            if (r13 == 0) goto Le0
            int r13 = r12.length()     // Catch: android.os.RemoteException -> L124
            if (r13 != 0) goto L24
            goto Le0
        L24:
            if (r10 != 0) goto L2c
            java.util.HashMap r13 = new java.util.HashMap     // Catch: android.os.RemoteException -> L124
            r13.<init>()     // Catch: android.os.RemoteException -> L124
            goto L2d
        L2c:
            r13 = r10
        L2d:
            if (r11 != 0) goto L35
            java.util.HashMap r2 = new java.util.HashMap     // Catch: android.os.RemoteException -> L124
            r2.<init>()     // Catch: android.os.RemoteException -> L124
            goto L36
        L35:
            r2 = r11
        L36:
            java.util.HashMap r3 = new java.util.HashMap     // Catch: android.os.RemoteException -> L124
            r3.<init>()     // Catch: android.os.RemoteException -> L124
            r3.putAll(r13)     // Catch: android.os.RemoteException -> L124
            r3.putAll(r2)     // Catch: android.os.RemoteException -> L124
            java.util.Iterator r13 = r12.keys()     // Catch: android.os.RemoteException -> L124
        L45:
            boolean r2 = r13.hasNext()     // Catch: android.os.RemoteException -> L124
            if (r2 == 0) goto Le0
            java.lang.Object r2 = r13.next()     // Catch: android.os.RemoteException -> L124
            java.lang.String r2 = (java.lang.String) r2     // Catch: android.os.RemoteException -> L124
            org.json.JSONArray r4 = r12.optJSONArray(r2)     // Catch: android.os.RemoteException -> L124
            if (r4 == 0) goto L45
            java.lang.Object r5 = r3.get(r2)     // Catch: android.os.RemoteException -> L124
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: android.os.RemoteException -> L124
            if (r5 != 0) goto L62
        L5f:
            r0 = 0
            goto Le0
        L62:
            java.lang.Object r5 = r5.get()     // Catch: android.os.RemoteException -> L124
            if (r5 != 0) goto L69
            goto L5f
        L69:
            java.lang.Class r5 = r5.getClass()     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbcm r6 = com.google.android.gms.internal.ads.zzbcv.zzbB     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: android.os.RemoteException -> L124
            java.lang.Object r6 = r7.zza(r6)     // Catch: android.os.RemoteException -> L124
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: android.os.RemoteException -> L124
            boolean r6 = r6.booleanValue()     // Catch: android.os.RemoteException -> L124
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "3010"
            boolean r2 = r2.equals(r6)     // Catch: android.os.RemoteException -> L124
            if (r2 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzbqa r2 = r8.zza     // Catch: android.os.RemoteException -> L124
            r5 = 0
            if (r2 == 0) goto L93
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzn()     // Catch: java.lang.Throwable -> L91
            goto La6
        L91:
            goto Lac
        L93:
            com.google.android.gms.internal.ads.zzbpw r2 = r8.zzl     // Catch: android.os.RemoteException -> L124
            if (r2 == 0) goto L9c
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzk()     // Catch: java.lang.Throwable -> L91
            goto La6
        L9c:
            com.google.android.gms.internal.ads.zzbpx r2 = r8.zzm     // Catch: android.os.RemoteException -> L124
            if (r2 == 0) goto La5
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj()     // Catch: java.lang.Throwable -> L91
            goto La6
        La5:
            r2 = r5
        La6:
            if (r2 == 0) goto Lac
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: android.os.RemoteException -> L124
        Lac:
            if (r5 != 0) goto Laf
            goto L5f
        Laf:
            java.lang.Class r5 = r5.getClass()     // Catch: android.os.RemoteException -> L124
        Lb3:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            r2.<init>()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            com.google.android.gms.ads.internal.util.zzbs.zzc(r4, r2)     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            android.content.Context r4 = r8.zze     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            java.util.Iterator r2 = r2.iterator()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
        Lc8:
            boolean r6 = r2.hasNext()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r2.next()     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            java.lang.String r6 = (java.lang.String) r6     // Catch: org.json.JSONException -> L45 android.os.RemoteException -> L124
            java.lang.Class r6 = java.lang.Class.forName(r6, r1, r4)     // Catch: java.lang.Throwable -> Lc8
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lc8
            goto L45
        Le0:
            r8.zzk = r0     // Catch: android.os.RemoteException -> L124
            java.util.HashMap r10 = zzc(r10)     // Catch: android.os.RemoteException -> L124
            java.util.HashMap r11 = zzc(r11)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbqa r12 = r8.zza     // Catch: android.os.RemoteException -> L124
            if (r12 == 0) goto Lfa
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: android.os.RemoteException -> L124
            r12.zzy(r9, r10, r11)     // Catch: android.os.RemoteException -> L124
            return
        Lfa:
            com.google.android.gms.internal.ads.zzbpw r12 = r8.zzl     // Catch: android.os.RemoteException -> L124
            if (r12 == 0) goto L10f
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: android.os.RemoteException -> L124
            r12.zzv(r9, r10, r11)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbpw r10 = r8.zzl     // Catch: android.os.RemoteException -> L124
            r10.zzu(r9)     // Catch: android.os.RemoteException -> L124
            return
        L10f:
            com.google.android.gms.internal.ads.zzbpx r12 = r8.zzm     // Catch: android.os.RemoteException -> L124
            if (r12 == 0) goto L123
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch: android.os.RemoteException -> L124
            r12.zzt(r9, r10, r11)     // Catch: android.os.RemoteException -> L124
            com.google.android.gms.internal.ads.zzbpx r10 = r8.zzm     // Catch: android.os.RemoteException -> L124
            r10.zzs(r9)     // Catch: android.os.RemoteException -> L124
        L123:
            return
        L124:
            r9 = move-exception
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r10, r9)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzdkx
    public final void zzz(android.view.View r1, java.util.Map r2) {
            r0 = this;
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch: android.os.RemoteException -> L1c
            com.google.android.gms.internal.ads.zzbqa r2 = r0.zza     // Catch: android.os.RemoteException -> L1c
            if (r2 == 0) goto Lc
            r2.zzz(r1)     // Catch: android.os.RemoteException -> L1c
            return
        Lc:
            com.google.android.gms.internal.ads.zzbpw r2 = r0.zzl     // Catch: android.os.RemoteException -> L1c
            if (r2 == 0) goto L14
            r2.zzw(r1)     // Catch: android.os.RemoteException -> L1c
            return
        L14:
            com.google.android.gms.internal.ads.zzbpx r2 = r0.zzm     // Catch: android.os.RemoteException -> L1c
            if (r2 == 0) goto L1b
            r2.zzu(r1)     // Catch: android.os.RemoteException -> L1c
        L1b:
            return
        L1c:
            r1 = move-exception
            java.lang.String r2 = "Failed to call untrackView"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r1)
            return
    }
}
