package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdlj extends com.google.android.gms.internal.ads.zzbgl implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, com.google.android.gms.internal.ads.zzdml {
    private final java.lang.ref.WeakReference zza;
    private final java.util.Map zzb;
    private final java.util.Map zzc;
    private final java.util.Map zzd;
    private com.google.android.gms.internal.ads.zzdkk zze;
    private com.google.android.gms.internal.ads.zzayw zzf;

    public zzdlj(android.view.View r5, java.util.HashMap r6, java.util.HashMap r7) {
            r4 = this;
            r4.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.zzb = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.zzc = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.zzd = r0
            r5.setOnTouchListener(r4)
            r5.setOnClickListener(r4)
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zza(r5, r4)
            com.google.android.gms.ads.internal.zzu.zzx()
            com.google.android.gms.internal.ads.zzcba.zzb(r5, r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r5)
            r4.zza = r0
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L39:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L39
            java.util.Map r2 = r4.zzb
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r2.put(r1, r3)
            java.lang.String r2 = "1098"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L39
            java.lang.String r2 = "3011"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L39
            r0.setOnTouchListener(r4)
            r1 = 1
            r0.setClickable(r1)
            r0.setOnClickListener(r4)
            goto L39
        L78:
            java.util.Map r6 = r4.zzd
            java.util.Map r0 = r4.zzb
            r6.putAll(r0)
            java.util.Set r6 = r7.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb3
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getValue()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L87
            java.util.Map r1 = r4.zzc
            java.lang.Object r7 = r7.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.put(r7, r2)
            r0.setOnTouchListener(r4)
            r7 = 0
            r0.setClickable(r7)
            goto L87
        Lb3:
            java.util.Map r6 = r4.zzd
            java.util.Map r7 = r4.zzc
            r6.putAll(r7)
            android.content.Context r6 = r5.getContext()
            com.google.android.gms.internal.ads.zzayw r7 = new com.google.android.gms.internal.ads.zzayw
            r7.<init>(r6, r5)
            r4.zzf = r7
            return
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(android.view.View r7) {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdkk r0 = r6.zze     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            android.view.View r2 = r6.zzf()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r3 = r6.zzl()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r4 = r6.zzm()     // Catch: java.lang.Throwable -> L1a
            r5 = 1
            r1 = r7
            r0.zzD(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r6)
            return
        L18:
            monitor-exit(r6)
            return
        L1a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdkk r0 = r5.zze     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            android.view.View r1 = r5.zzf()     // Catch: java.lang.Throwable -> L20
            java.util.Map r2 = r5.zzl()     // Catch: java.lang.Throwable -> L20
            java.util.Map r3 = r5.zzm()     // Catch: java.lang.Throwable -> L20
            android.view.View r4 = r5.zzf()     // Catch: java.lang.Throwable -> L20
            boolean r4 = com.google.android.gms.internal.ads.zzdkk.zzY(r4)     // Catch: java.lang.Throwable -> L20
            r0.zzB(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L1e:
            monitor-exit(r5)
            return
        L20:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdkk r0 = r5.zze     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1e
            android.view.View r1 = r5.zzf()     // Catch: java.lang.Throwable -> L20
            java.util.Map r2 = r5.zzl()     // Catch: java.lang.Throwable -> L20
            java.util.Map r3 = r5.zzm()     // Catch: java.lang.Throwable -> L20
            android.view.View r4 = r5.zzf()     // Catch: java.lang.Throwable -> L20
            boolean r4 = com.google.android.gms.internal.ads.zzdkk.zzY(r4)     // Catch: java.lang.Throwable -> L20
            r0.zzB(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r5)
            return
        L1e:
            monitor-exit(r5)
            return
        L20:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdkk r0 = r2.zze     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lc
            android.view.View r1 = r2.zzf()     // Catch: java.lang.Throwable -> Lf
            r0.zzL(r3, r4, r1)     // Catch: java.lang.Throwable -> Lf
        Lc:
            r3 = 0
            monitor-exit(r2)
            return r3
        Lf:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final synchronized void zzb(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zze     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1b
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L12
            java.lang.String r0 = "Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r0)     // Catch: java.lang.Throwable -> L1d
        L12:
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zze     // Catch: java.lang.Throwable -> L1d
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L1d
            r0.zzN(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)
            return
        L1b:
            monitor-exit(r1)
            return
        L1d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final synchronized void zzc(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch: java.lang.Throwable -> L36
            boolean r0 = r2 instanceof com.google.android.gms.internal.ads.zzdkk     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L10
            java.lang.String r2 = "Not an instance of InternalNativeAd. This is most likely a transient error"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)
            return
        L10:
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zze     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L17
            r0.zzT(r1)     // Catch: java.lang.Throwable -> L36
        L17:
            com.google.android.gms.internal.ads.zzdkk r2 = (com.google.android.gms.internal.ads.zzdkk) r2     // Catch: java.lang.Throwable -> L36
            boolean r0 = r2.zzU()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L2f
            r1.zze = r2     // Catch: java.lang.Throwable -> L36
            r2.zzS(r1)     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzdkk r2 = r1.zze     // Catch: java.lang.Throwable -> L36
            android.view.View r0 = r1.zzf()     // Catch: java.lang.Throwable -> L36
            r2.zzK(r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)
            return
        L2f:
            java.lang.String r2 = "Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r1)
            return
        L36:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final synchronized void zzd() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdkk r0 = r1.zze     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Ld
            r0.zzT(r1)     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            r1.zze = r0     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final android.view.View zzf() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zza
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized android.view.View zzg(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzd     // Catch: java.lang.Throwable -> L16
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto Le
            r2 = 0
            monitor-exit(r1)
            return r2
        Le:
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L16
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final android.widget.FrameLayout zzh() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final com.google.android.gms.internal.ads.zzayw zzi() {
            r1 = this;
            com.google.android.gms.internal.ads.zzayw r0 = r1.zzf
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzj() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.lang.String zzk() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "1007"
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzl() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzd     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzm() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized java.util.Map zzn() {
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized org.json.JSONObject zzo() {
            r1 = this;
            monitor-enter(r1)
            monitor-exit(r1)
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized org.json.JSONObject zzp() {
            r4 = this;
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzdkk r0 = r4.zze     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L17
            android.view.View r1 = r4.zzf()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r2 = r4.zzl()     // Catch: java.lang.Throwable -> L1a
            java.util.Map r3 = r4.zzm()     // Catch: java.lang.Throwable -> L1a
            org.json.JSONObject r0 = r0.zzj(r1, r2, r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r4)
            return r0
        L17:
            r0 = 0
            monitor-exit(r4)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzdml
    public final synchronized void zzq(java.lang.String r2, android.view.View r3, boolean r4) {
            r1 = this;
            monitor-enter(r1)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L34
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L34
            java.util.Map r0 = r1.zzd     // Catch: java.lang.Throwable -> L34
            r0.put(r2, r4)     // Catch: java.lang.Throwable -> L34
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L32
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L1c
            goto L32
        L1c:
            java.util.Map r4 = r1.zzb     // Catch: java.lang.Throwable -> L34
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r4.put(r2, r0)     // Catch: java.lang.Throwable -> L34
            r2 = 1
            r3.setClickable(r2)     // Catch: java.lang.Throwable -> L34
            r3.setOnClickListener(r1)     // Catch: java.lang.Throwable -> L34
            r3.setOnTouchListener(r1)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r1)
            return
        L32:
            monitor-exit(r1)
            return
        L34:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }
}
