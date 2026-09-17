package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzey {
    public static final java.util.Set zza = null;
    private static com.google.android.gms.ads.internal.client.zzey zzb;
    private final java.lang.Object zzc;
    private final java.lang.Object zzd;
    private com.google.android.gms.ads.internal.client.zzci zze;
    private final java.util.ArrayList zzf;
    private boolean zzg;
    private boolean zzh;
    private final java.lang.Object zzi;
    private com.google.android.gms.ads.internal.client.zzcz zzj;
    private com.google.android.gms.ads.OnAdInspectorClosedListener zzk;
    private com.google.android.gms.ads.RequestConfiguration zzl;

    static {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 3
            com.google.android.gms.ads.AdFormat[] r1 = new com.google.android.gms.ads.AdFormat[r1]
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            r3 = 1
            r1[r3] = r2
            com.google.android.gms.ads.AdFormat r2 = com.google.android.gms.ads.AdFormat.REWARDED
            r3 = 2
            r1[r3] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            com.google.android.gms.ads.internal.client.zzey.zza = r0
            return
    }

    private zzey() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzc = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzd = r0
            r0 = 0
            r1.zzg = r0
            r1.zzh = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzi = r0
            r0 = 0
            r1.zzk = r0
            com.google.android.gms.ads.RequestConfiguration$Builder r0 = new com.google.android.gms.ads.RequestConfiguration$Builder
            r0.<init>()
            com.google.android.gms.ads.RequestConfiguration r0 = r0.build()
            r1.zzl = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzf = r0
            return
    }

    private static com.google.android.gms.ads.initialization.InitializationStatus zzA(java.util.List r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r6.next()
            com.google.android.gms.internal.ads.zzblu r1 = (com.google.android.gms.internal.ads.zzblu) r1
            java.lang.String r2 = r1.zza
            com.google.android.gms.internal.ads.zzbmc r3 = new com.google.android.gms.internal.ads.zzbmc
            boolean r4 = r1.zzb
            if (r4 == 0) goto L20
            com.google.android.gms.ads.initialization.AdapterStatus$State r4 = com.google.android.gms.ads.initialization.AdapterStatus.State.READY
            goto L22
        L20:
            com.google.android.gms.ads.initialization.AdapterStatus$State r4 = com.google.android.gms.ads.initialization.AdapterStatus.State.NOT_READY
        L22:
            java.lang.String r5 = r1.zzd
            int r1 = r1.zzc
            r3.<init>(r4, r5, r1)
            r0.put(r2, r3)
            goto L9
        L2d:
            com.google.android.gms.internal.ads.zzbmd r6 = new com.google.android.gms.internal.ads.zzbmd
            r6.<init>(r0)
            return r6
    }

    private final void zzB(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbpd r3 = com.google.android.gms.internal.ads.zzbpd.zza()     // Catch: android.os.RemoteException -> L17
            r0 = 0
            r3.zzb(r2, r0)     // Catch: android.os.RemoteException -> L17
            com.google.android.gms.ads.internal.client.zzcz r2 = r1.zzj     // Catch: android.os.RemoteException -> L17
            r2.zzk()     // Catch: android.os.RemoteException -> L17
            com.google.android.gms.ads.internal.client.zzcz r2 = r1.zzj     // Catch: android.os.RemoteException -> L17
            com.google.android.gms.dynamic.IObjectWrapper r3 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L17
            r2.zzl(r0, r3)     // Catch: android.os.RemoteException -> L17
            return
        L17:
            r2 = move-exception
            java.lang.String r3 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r3, r2)
            return
    }

    private final void zzC(android.content.Context r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzcz r0 = r2.zzj
            if (r0 != 0) goto L16
            com.google.android.gms.ads.internal.client.zzba r0 = com.google.android.gms.ads.internal.client.zzbc.zza()
            com.google.android.gms.ads.internal.client.zzav r1 = new com.google.android.gms.ads.internal.client.zzav
            r1.<init>(r0, r3)
            r0 = 0
            java.lang.Object r3 = r1.zzd(r3, r0)
            com.google.android.gms.ads.internal.client.zzcz r3 = (com.google.android.gms.ads.internal.client.zzcz) r3
            r2.zzj = r3
        L16:
            return
    }

    private final void zzD(com.google.android.gms.ads.RequestConfiguration r3) {
            r2 = this;
            com.google.android.gms.ads.internal.client.zzcz r0 = r2.zzj     // Catch: android.os.RemoteException -> Lb
            com.google.android.gms.ads.internal.client.zzfw r1 = new com.google.android.gms.ads.internal.client.zzfw     // Catch: android.os.RemoteException -> Lb
            r1.<init>(r3)     // Catch: android.os.RemoteException -> Lb
            r0.zzu(r1)     // Catch: android.os.RemoteException -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r0 = "Unable to set request configuration parcel."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r3)
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.OnAdInspectorClosedListener zzb(com.google.android.gms.ads.internal.client.zzey r0) {
            com.google.android.gms.ads.OnAdInspectorClosedListener r0 = r0.zzk
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.initialization.InitializationStatus zzd(java.util.List r0) {
            com.google.android.gms.ads.initialization.InitializationStatus r0 = zzA(r0)
            return r0
    }

    public static com.google.android.gms.ads.internal.client.zzey zzf() {
            java.lang.Class<com.google.android.gms.ads.internal.client.zzey> r0 = com.google.android.gms.ads.internal.client.zzey.class
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzey r1 = com.google.android.gms.ads.internal.client.zzey.zzb     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.ads.internal.client.zzey r1 = new com.google.android.gms.ads.internal.client.zzey     // Catch: java.lang.Throwable -> L12
            r1.<init>()     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.ads.internal.client.zzey.zzb = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.ads.internal.client.zzey r1 = com.google.android.gms.ads.internal.client.zzey.zzb     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    static /* bridge */ /* synthetic */ java.lang.Object zzh(com.google.android.gms.ads.internal.client.zzey r0) {
            java.lang.Object r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.ArrayList zzj(com.google.android.gms.ads.internal.client.zzey r0) {
            java.util.ArrayList r0 = r0.zzf
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Optional zzk(com.google.android.gms.ads.internal.client.zzey r6, com.google.android.gms.ads.internal.client.zzfu r7) {
            java.lang.String r6 = r7.zza
            int r0 = r7.zzb
            com.google.android.gms.ads.AdFormat r0 = com.google.android.gms.ads.AdFormat.getAdFormat(r0)
            if (r0 != 0) goto L10
            java.util.Optional r6 = java.util.Optional.empty()
            goto L8a
        L10:
            com.google.android.gms.ads.internal.client.zzm r1 = r7.zzc
            com.google.android.gms.ads.AdRequest$Builder r2 = new com.google.android.gms.ads.AdRequest$Builder
            r2.<init>()
            java.util.List r3 = r1.zze
            if (r3 == 0) goto L2f
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.addKeyword(r4)
            goto L1f
        L2f:
            android.os.Bundle r3 = r1.zzm
            r2.zzc(r3)
            android.os.Bundle r3 = r1.zzn
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L54
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            android.os.Bundle r5 = r1.zzn
            java.lang.String r5 = r5.getString(r4)
            r2.addCustomTargeting(r4, r5)
            goto L3e
        L54:
            java.lang.String r3 = r1.zzx
            r2.setAdString(r3)
            java.lang.String r3 = r1.zzl
            java.util.Optional r3 = java.util.Optional.ofNullable(r3)
            com.google.android.gms.ads.internal.client.zzq r4 = new com.google.android.gms.ads.internal.client.zzq
            r4.<init>(r2)
            r3.ifPresent(r4)
            java.util.List r3 = r1.zzv
            r2.setNeighboringContentUrls(r3)
            java.lang.String r1 = r1.zzp
            r2.setRequestAgent(r1)
            com.google.android.gms.ads.AdRequest r1 = r2.build()
            com.google.android.gms.ads.preload.PreloadConfiguration$Builder r2 = new com.google.android.gms.ads.preload.PreloadConfiguration$Builder
            r2.<init>(r6, r0)
            r2.setAdRequest(r1)
            int r6 = r7.zzd
            r2.setBufferSize(r6)
            com.google.android.gms.ads.preload.PreloadConfiguration r6 = r2.build()
            java.util.Optional r6 = java.util.Optional.of(r6)
        L8a:
            return r6
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.ads.internal.client.zzey r0, boolean r1) {
            r1 = 1
            r0.zzh = r1
            return
    }

    static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.ads.internal.client.zzey r0, boolean r1) {
            r1 = 0
            r0.zzg = r1
            return
    }

    public final float zza() {
            r4 = this;
            java.lang.Object r0 = r4.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r4.zzj     // Catch: java.lang.Throwable -> L18
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        Lb:
            float r2 = r1.zze()     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L18
            goto L16
        L10:
            r1 = move-exception
            java.lang.String r3 = "Unable to get app volume."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public final com.google.android.gms.ads.RequestConfiguration zzc() {
            r1 = this;
            com.google.android.gms.ads.RequestConfiguration r0 = r1.zzl
            return r0
    }

    public final com.google.android.gms.ads.initialization.InitializationStatus zze() {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MobileAds.initialize() must be called prior to getting initialization status."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L27
            java.util.List r1 = r1.zzg()     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L27
            com.google.android.gms.ads.initialization.InitializationStatus r1 = zzA(r1)     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r1
        L1b:
            java.lang.String r1 = "Unable to get Initialization status."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r1)     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.ads.internal.client.zzem r1 = new com.google.android.gms.ads.internal.client.zzem     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return r1
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    public final com.google.android.gms.common.api.Status zzg(android.content.Context r17, java.util.List r18, com.google.android.gms.ads.preload.PreloadCallback r19) {
            r16 = this;
            r1 = r16
            r0 = r17
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r4 = r18.iterator()
        L12:
            boolean r5 = r4.hasNext()
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()
            com.google.android.gms.ads.preload.PreloadConfiguration r5 = (com.google.android.gms.ads.preload.PreloadConfiguration) r5
            com.google.android.gms.ads.AdFormat r8 = r5.getAdFormat()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = r5.getAdUnitId()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "#"
            r9.append(r8)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r3.getOrDefault(r5, r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.put(r5, r6)
            goto L12
        L57:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L5f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= r7) goto L5f
            java.lang.String r3 = "Preload configurations include duplicated ad unit IDs and ad format combinations"
            r2.add(r3)
            r3 = 1
            goto L7f
        L7e:
            r3 = 0
        L7f:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r5 = r18.iterator()
        L88:
            boolean r8 = r5.hasNext()
            r9 = 15
            r10 = 2
            if (r8 == 0) goto Lfc
            java.lang.Object r8 = r5.next()
            com.google.android.gms.ads.preload.PreloadConfiguration r8 = (com.google.android.gms.ads.preload.PreloadConfiguration) r8
            com.google.android.gms.ads.AdFormat r11 = r8.getAdFormat()
            java.util.Set r12 = com.google.android.gms.ads.internal.client.zzey.zza
            com.google.android.gms.ads.AdFormat r13 = r8.getAdFormat()
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto Lba
            com.google.android.gms.ads.AdFormat r3 = r8.getAdFormat()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r8 = "PreloadConfiguration ad format is not supported:"
            java.lang.String r3 = r8.concat(r3)
            r2.add(r3)
        Lb8:
            r3 = 1
            goto L88
        Lba:
            com.google.android.gms.ads.internal.client.zzen r12 = new com.google.android.gms.ads.internal.client.zzen
            r12.<init>()
            r4.compute(r11, r12)
            int r12 = r8.getBufferSize()
            if (r12 <= r9) goto Le2
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            java.lang.String r9 = r11.name()
            r8[r7] = r9
            java.lang.String r9 = "Preload configurations' buffer size exceeds the maximum limit %d for %s"
            java.lang.String r3 = java.lang.String.format(r3, r9, r8)
            r2.add(r3)
            goto Lb8
        Le2:
            int r8 = r8.getBufferSize()
            if (r8 >= 0) goto L88
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r9 = r11.name()
            r8[r6] = r9
            java.lang.String r9 = "Preload configurations' buffer size less than 0 for %s"
            java.lang.String r3 = java.lang.String.format(r3, r9, r8)
            r2.add(r3)
            goto Lb8
        Lfc:
            com.google.android.gms.ads.AdFormat r5 = com.google.android.gms.ads.AdFormat.APP_OPEN_AD
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzet
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r8 = r11.zza(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            com.google.android.gms.ads.AdFormat r11 = com.google.android.gms.ads.AdFormat.INTERSTITIAL
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzer
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r13.zza(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            com.google.android.gms.ads.AdFormat r13 = com.google.android.gms.ads.AdFormat.REWARDED
            com.google.android.gms.internal.ads.zzbcm r14 = com.google.android.gms.internal.ads.zzbcv.zzes
            com.google.android.gms.internal.ads.zzbct r15 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r14 = r15.zza(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            r15 = 3
            java.util.Map$Entry[] r9 = new java.util.Map.Entry[r15]
            java.util.AbstractMap$SimpleEntry r15 = new java.util.AbstractMap$SimpleEntry
            r15.<init>(r5, r8)
            r9[r6] = r15
            java.util.AbstractMap$SimpleEntry r5 = new java.util.AbstractMap$SimpleEntry
            r5.<init>(r11, r12)
            r9[r7] = r5
            java.util.AbstractMap$SimpleEntry r5 = new java.util.AbstractMap$SimpleEntry
            r5.<init>(r13, r14)
            r9[r10] = r5
            java.util.HashMap r5 = new java.util.HashMap
            r8 = 3
            r5.<init>(r8)
            r11 = 0
        L145:
            if (r11 >= r8) goto L173
            r12 = r9[r11]
            java.lang.Object r13 = r12.getKey()
            java.util.Objects.requireNonNull(r13)
            java.lang.Object r12 = r12.getValue()
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r12 = r5.put(r13, r12)
            if (r12 != 0) goto L160
            int r11 = r11 + 1
            goto L145
        L160:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "duplicate key: "
            r13.toString()
            java.lang.String r3 = java.lang.String.valueOf(r13)
            java.lang.String r2 = r2.concat(r3)
            r0.<init>(r2)
            throw r0
        L173:
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L17f:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L1c6
            java.lang.Object r8 = r4.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            com.google.android.gms.ads.AdFormat r9 = (com.google.android.gms.ads.AdFormat) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.Object r11 = r5.getOrDefault(r9, r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r8 <= r11) goto L17f
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r8 = new java.lang.Object[r10]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8[r6] = r11
            java.lang.String r9 = r9.name()
            r8[r7] = r9
            java.lang.String r9 = "Preload configurations' size exceeds the maximum limit %d for %s"
            java.lang.String r3 = java.lang.String.format(r3, r9, r8)
            r2.add(r3)
            r3 = 1
            goto L17f
        L1c6:
            if (r3 == 0) goto L1fb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1d1:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1ec
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1d1
            java.lang.String r4 = ", "
            r3.append(r4)
            goto L1d1
        L1ec:
            java.lang.String r2 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r4 = 13
            r3.<init>(r4, r2)
            goto L1fd
        L1fb:
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
        L1fd:
            java.lang.String r2 = r3.getStatusMessage()
            if (r2 != 0) goto L205
            java.lang.String r2 = ""
        L205:
            boolean r3 = r3.isSuccess()
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r2)
            com.google.android.gms.internal.ads.zzbcv.zza(r17)
            java.lang.Object r2 = r1.zzd
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzci r3 = r1.zze     // Catch: java.lang.Throwable -> L368
            if (r3 != 0) goto L225
            com.google.android.gms.ads.internal.client.zzba r3 = com.google.android.gms.ads.internal.client.zzbc.zza()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbph r4 = new com.google.android.gms.internal.ads.zzbph     // Catch: java.lang.Throwable -> L368
            r4.<init>()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzci r3 = r3.zzg(r0, r4)     // Catch: java.lang.Throwable -> L368
            r1.zze = r3     // Catch: java.lang.Throwable -> L368
        L225:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L368
            r3.<init>()     // Catch: java.lang.Throwable -> L368
            java.util.Iterator r4 = r18.iterator()     // Catch: java.lang.Throwable -> L368
        L22e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L368
            if (r5 == 0) goto L34e
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.preload.PreloadConfiguration r5 = (com.google.android.gms.ads.preload.PreloadConfiguration) r5     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzr r6 = com.google.android.gms.ads.internal.client.zzr.zza     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.AdRequest r8 = r5.getAdRequest()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzei r8 = r8.zza()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzm r6 = r6.zza(r0, r8)     // Catch: java.lang.Throwable -> L368
            android.os.Bundle r8 = r6.zzc     // Catch: java.lang.Throwable -> L368
            java.lang.String r9 = "is_sdk_preload"
            r8.putBoolean(r9, r7)     // Catch: java.lang.Throwable -> L368
            int r8 = r5.getBufferSize()     // Catch: java.lang.Throwable -> L368
            r9 = 5
            if (r8 > 0) goto L299
            com.google.android.gms.ads.AdFormat r8 = r5.getAdFormat()     // Catch: java.lang.Throwable -> L368
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L368
            if (r8 == r7) goto L288
            if (r8 == r10) goto L277
            if (r8 == r9) goto L266
            r8 = 1
            goto L29d
        L266:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzy     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r8 = r11.zza(r8)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L368
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L368
            goto L29d
        L277:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzA     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r8 = r11.zza(r8)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L368
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L368
            goto L29d
        L288:
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzz     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r8 = r11.zza(r8)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L368
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L368
            goto L29d
        L299:
            int r8 = r5.getBufferSize()     // Catch: java.lang.Throwable -> L368
        L29d:
            com.google.android.gms.ads.AdFormat r11 = r5.getAdFormat()     // Catch: java.lang.Throwable -> L368
            int r11 = r11.ordinal()     // Catch: java.lang.Throwable -> L368
            if (r11 == r7) goto L2d1
            if (r11 == r10) goto L2c0
            if (r11 == r9) goto L2af
            r11 = 1
        L2ac:
            r12 = 15
            goto L2e2
        L2af:
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzv     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r11 = r12.zza(r11)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L368
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L368
            goto L2ac
        L2c0:
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzx     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r11 = r12.zza(r11)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L368
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L368
            goto L2ac
        L2d1:
            com.google.android.gms.internal.ads.zzbcm r11 = com.google.android.gms.internal.ads.zzbcv.zzw     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r12 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r11 = r12.zza(r11)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.Throwable -> L368
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L368
            goto L2ac
        L2e2:
            int r11 = java.lang.Math.min(r11, r12)     // Catch: java.lang.Throwable -> L368
            int r11 = java.lang.Math.max(r11, r7)     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.AdFormat r13 = r5.getAdFormat()     // Catch: java.lang.Throwable -> L368
            int r13 = r13.ordinal()     // Catch: java.lang.Throwable -> L368
            if (r13 == r7) goto L31c
            if (r13 == r10) goto L30b
            if (r13 == r9) goto L2fa
            r9 = 1
            goto L32c
        L2fa:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzB     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r9 = r13.zza(r9)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L368
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L368
            goto L32c
        L30b:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzD     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r9 = r13.zza(r9)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L368
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L368
            goto L32c
        L31c:
            com.google.android.gms.internal.ads.zzbcm r9 = com.google.android.gms.internal.ads.zzbcv.zzC     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L368
            java.lang.Object r9 = r13.zza(r9)     // Catch: java.lang.Throwable -> L368
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Throwable -> L368
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L368
        L32c:
            int r9 = java.lang.Math.min(r9, r11)     // Catch: java.lang.Throwable -> L368
            int r8 = java.lang.Math.min(r8, r11)     // Catch: java.lang.Throwable -> L368
            int r8 = java.lang.Math.max(r8, r9)     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzfu r9 = new com.google.android.gms.ads.internal.client.zzfu     // Catch: java.lang.Throwable -> L368
            java.lang.String r11 = r5.getAdUnitId()     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.ads.AdFormat r5 = r5.getAdFormat()     // Catch: java.lang.Throwable -> L368
            int r5 = r5.getValue()     // Catch: java.lang.Throwable -> L368
            r9.<init>(r11, r5, r6, r8)     // Catch: java.lang.Throwable -> L368
            r3.add(r9)     // Catch: java.lang.Throwable -> L368
            goto L22e
        L34e:
            com.google.android.gms.ads.internal.client.zzci r0 = r1.zze     // Catch: android.os.RemoteException -> L35e java.lang.Throwable -> L368
            com.google.android.gms.ads.internal.client.zzes r4 = new com.google.android.gms.ads.internal.client.zzes     // Catch: android.os.RemoteException -> L35e java.lang.Throwable -> L368
            r5 = r19
            r4.<init>(r1, r5)     // Catch: android.os.RemoteException -> L35e java.lang.Throwable -> L368
            r0.zzi(r3, r4)     // Catch: android.os.RemoteException -> L35e java.lang.Throwable -> L368
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r0
        L35e:
            r0 = move-exception
            java.lang.String r3 = "Unable to start preload."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r0)     // Catch: java.lang.Throwable -> L368
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR     // Catch: java.lang.Throwable -> L368
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L368
            return r0
        L368:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L368
            throw r0
    }

    public final java.lang.String zzi() {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MobileAds.initialize() must be called prior to getting version string."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L25
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L25
            java.lang.String r1 = r1.zzf()     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L25
            java.lang.String r1 = com.google.android.gms.internal.ads.zzfyo.zzc(r1)     // Catch: android.os.RemoteException -> L1b java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r1
        L1b:
            r1 = move-exception
            java.lang.String r2 = "Unable to get internal version."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r2, r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = ""
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r1
    }

    public final void zzn(android.content.Context r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzi
            monitor-enter(r0)
            r1.zzC(r2)     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.ads.internal.client.zzcz r2 = r1.zzj     // Catch: android.os.RemoteException -> Lc java.lang.Throwable -> L13
            r2.zzi()     // Catch: android.os.RemoteException -> Lc java.lang.Throwable -> L13
            goto L11
        Lc:
            java.lang.String r2 = "Unable to disable mediation adapter initialization."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r2)     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    public final void zzo(android.content.Context r3, java.lang.String r4, com.google.android.gms.ads.initialization.OnInitializationCompleteListener r5) {
            r2 = this;
            java.lang.Object r4 = r2.zzc
            monitor-enter(r4)
            boolean r0 = r2.zzg     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L10
            if (r5 == 0) goto Le
            java.util.ArrayList r3 = r2.zzf     // Catch: java.lang.Throwable -> Ld8
            r3.add(r5)     // Catch: java.lang.Throwable -> Ld8
        Le:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            return
        L10:
            boolean r0 = r2.zzh     // Catch: java.lang.Throwable -> Ld8
            if (r0 == 0) goto L1f
            if (r5 == 0) goto L1d
            com.google.android.gms.ads.initialization.InitializationStatus r3 = r2.zze()     // Catch: java.lang.Throwable -> Ld8
            r5.onInitializationComplete(r3)     // Catch: java.lang.Throwable -> Ld8
        L1d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            return
        L1f:
            r0 = 1
            r2.zzg = r0     // Catch: java.lang.Throwable -> Ld8
            if (r5 == 0) goto L29
            java.util.ArrayList r0 = r2.zzf     // Catch: java.lang.Throwable -> Ld8
            r0.add(r5)     // Catch: java.lang.Throwable -> Ld8
        L29:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            if (r3 == 0) goto Ld0
            java.lang.Object r4 = r2.zzi
            monitor-enter(r4)
            r5 = 0
            r2.zzC(r3)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzcz r0 = r2.zzj     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzex r1 = new com.google.android.gms.ads.internal.client.zzex     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r0.zzs(r1)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.internal.client.zzcz r0 = r2.zzj     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.internal.ads.zzbph r1 = new com.google.android.gms.internal.ads.zzbph     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1.<init>()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r0.zzo(r1)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzl     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            int r0 = r0.getTagForChildDirectedTreatment()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r1 = -1
            if (r0 != r1) goto L58
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzl     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            int r0 = r0.getTagForUnderAgeOfConsent()     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            if (r0 == r1) goto L66
        L58:
            com.google.android.gms.ads.RequestConfiguration r0 = r2.zzl     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            r2.zzD(r0)     // Catch: java.lang.Throwable -> L5e android.os.RemoteException -> L60
            goto L66
        L5e:
            r3 = move-exception
            goto Lce
        L60:
            r0 = move-exception
            java.lang.String r1 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)     // Catch: java.lang.Throwable -> L5e
        L66:
            com.google.android.gms.internal.ads.zzbcv.zza(r3)     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zza     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L99
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkN     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L99
            java.lang.String r0 = "Initializing on bg thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.ThreadPoolExecutor r0 = com.google.android.gms.ads.internal.util.client.zzb.zza     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.ads.internal.client.zzeo r1 = new com.google.android.gms.ads.internal.client.zzeo     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L5e
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5e
            goto Lcc
        L99:
            com.google.android.gms.internal.ads.zzbeb r0 = com.google.android.gms.internal.ads.zzbep.zzb     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto Lc4
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzkN     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto Lc4
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.ads.internal.util.client.zzb.zzb     // Catch: java.lang.Throwable -> L5e
            com.google.android.gms.ads.internal.client.zzep r1 = new com.google.android.gms.ads.internal.client.zzep     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L5e
            r0.execute(r1)     // Catch: java.lang.Throwable -> L5e
            goto Lcc
        Lc4:
            java.lang.String r0 = "Initializing on calling thread"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Throwable -> L5e
            r2.zzB(r3, r5)     // Catch: java.lang.Throwable -> L5e
        Lcc:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            return
        Lce:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5e
            throw r3
        Ld0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Context cannot be null."
            r3.<init>(r4)
            throw r3
        Ld8:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Ld8
            throw r3
    }

    final /* synthetic */ void zzp(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r3 = r1.zzi
            monitor-enter(r3)
            r0 = 0
            r1.zzB(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    final /* synthetic */ void zzq(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            java.lang.Object r3 = r1.zzi
            monitor-enter(r3)
            r0 = 0
            r1.zzB(r2, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final void zzr(android.content.Context r5, com.google.android.gms.ads.OnAdInspectorClosedListener r6) {
            r4 = this;
            java.lang.Object r0 = r4.zzi
            monitor-enter(r0)
            r4.zzC(r5)     // Catch: java.lang.Throwable -> L2a
            r4.zzk = r6     // Catch: java.lang.Throwable -> L2a
            com.google.android.gms.ads.internal.client.zzcz r5 = r4.zzj     // Catch: android.os.RemoteException -> L14 java.lang.Throwable -> L2a
            com.google.android.gms.ads.internal.client.zzev r1 = new com.google.android.gms.ads.internal.client.zzev     // Catch: android.os.RemoteException -> L14 java.lang.Throwable -> L2a
            r2 = 0
            r1.<init>(r2)     // Catch: android.os.RemoteException -> L14 java.lang.Throwable -> L2a
            r5.zzm(r1)     // Catch: android.os.RemoteException -> L14 java.lang.Throwable -> L2a
            goto L28
        L14:
            java.lang.String r5 = "Unable to open the ad inspector."
            com.google.android.gms.ads.internal.util.client.zzm.zzg(r5)     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L28
            com.google.android.gms.ads.AdInspectorError r5 = new com.google.android.gms.ads.AdInspectorError     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            java.lang.String r2 = "Ad inspector had an internal error."
            java.lang.String r3 = "com.google.android.gms.ads"
            r5.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r6.onAdInspectorClosed(r5)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    public final void zzs(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MobileAds.initialize() must be called prior to opening debug menu."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            r1.zzn(r4, r5)     // Catch: android.os.RemoteException -> L19 java.lang.Throwable -> L21
            goto L1f
        L19:
            r4 = move-exception
            java.lang.String r5 = "Unable to open debug menu."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r5, r4)     // Catch: java.lang.Throwable -> L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r4
    }

    public final void zzt(java.lang.Class r3) {
            r2 = this;
            java.lang.Object r0 = r2.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r2.zzj     // Catch: java.lang.Throwable -> Ld android.os.RemoteException -> Lf
            java.lang.String r3 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> Ld android.os.RemoteException -> Lf
            r1.zzh(r3)     // Catch: java.lang.Throwable -> Ld android.os.RemoteException -> Lf
            goto L15
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            java.lang.String r1 = "Unable to register RtbAdapter"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r3)     // Catch: java.lang.Throwable -> Ld
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    public final void zzu(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MobileAds.initialize() must be called prior to setting app muted state."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: android.os.RemoteException -> L15 java.lang.Throwable -> L1d
            r1.zzp(r4)     // Catch: android.os.RemoteException -> L15 java.lang.Throwable -> L1d
            goto L1b
        L15:
            r4 = move-exception
            java.lang.String r1 = "Unable to set app mute state."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public final void zzv(float r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 < 0) goto Lf
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 > 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            java.lang.String r3 = "The app volume must be a value between 0 and 1 inclusive."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
            java.lang.Object r2 = r4.zzi
            monitor-enter(r2)
            com.google.android.gms.ads.internal.client.zzcz r3 = r4.zzj     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.String r1 = "MobileAds.initialize() must be called prior to setting the app volume."
            com.google.android.gms.common.internal.Preconditions.checkState(r0, r1)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.ads.internal.client.zzcz r0 = r4.zzj     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L31
            r0.zzq(r5)     // Catch: android.os.RemoteException -> L29 java.lang.Throwable -> L31
            goto L2f
        L29:
            r5 = move-exception
            java.lang.String r0 = "Unable to set app volume."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r5)     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r5
    }

    public final void zzw(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            java.lang.String r2 = "MobileAds.initialize() must be called prior to setting the plugin."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r2)     // Catch: java.lang.Throwable -> L1d
            com.google.android.gms.ads.internal.client.zzcz r1 = r3.zzj     // Catch: android.os.RemoteException -> L15 java.lang.Throwable -> L1d
            r1.zzt(r4)     // Catch: android.os.RemoteException -> L15 java.lang.Throwable -> L1d
            goto L1b
        L15:
            r4 = move-exception
            java.lang.String r1 = "Unable to set plugin."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r4)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
    }

    public final void zzx(com.google.android.gms.ads.RequestConfiguration r5) {
            r4 = this;
            if (r5 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.Object r0 = r4.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.RequestConfiguration r1 = r4.zzl     // Catch: java.lang.Throwable -> L30
            r4.zzl = r5     // Catch: java.lang.Throwable -> L30
            com.google.android.gms.ads.internal.client.zzcz r2 = r4.zzj     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L17:
            int r2 = r1.getTagForChildDirectedTreatment()     // Catch: java.lang.Throwable -> L30
            int r3 = r5.getTagForChildDirectedTreatment()     // Catch: java.lang.Throwable -> L30
            if (r2 != r3) goto L2b
            int r1 = r1.getTagForUnderAgeOfConsent()     // Catch: java.lang.Throwable -> L30
            int r2 = r5.getTagForUnderAgeOfConsent()     // Catch: java.lang.Throwable -> L30
            if (r1 == r2) goto L2e
        L2b:
            r4.zzD(r5)     // Catch: java.lang.Throwable -> L30
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r5
    }

    public final boolean zzy() {
            r4 = this;
            java.lang.Object r0 = r4.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r4.zzj     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        La:
            boolean r2 = r1.zzv()     // Catch: android.os.RemoteException -> Lf java.lang.Throwable -> L17
            goto L15
        Lf:
            r1 = move-exception
            java.lang.String r3 = "Unable to get app mute state."
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r3, r1)     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public final boolean zzz(boolean r6) {
            r5 = this;
            java.lang.Object r0 = r5.zzi
            monitor-enter(r0)
            com.google.android.gms.ads.internal.client.zzcz r1 = r5.zzj     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String r4 = "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID."
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r4)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.ads.internal.client.zzcz r1 = r5.zzj     // Catch: android.os.RemoteException -> L18 java.lang.Throwable -> L3b
            r1.zzj(r6)     // Catch: android.os.RemoteException -> L18 java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r2
        L18:
            r1 = move-exception
            if (r6 == 0) goto L1e
            java.lang.String r6 = "enable"
            goto L20
        L1e:
            java.lang.String r6 = "disable"
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "Unable to "
            r2.append(r4)     // Catch: java.lang.Throwable -> L3b
            r2.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = " the publisher first-party ID."
            r2.append(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r6, r1)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r3
        L3b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
    }
}
