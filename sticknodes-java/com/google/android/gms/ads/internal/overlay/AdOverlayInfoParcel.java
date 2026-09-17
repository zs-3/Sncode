package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel> CREATOR = null;
    private static final java.util.concurrent.atomic.AtomicLong zzy = null;
    private static final java.util.concurrent.ConcurrentHashMap zzz = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public final com.google.android.gms.ads.internal.overlay.zzc zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.overlay.zzr zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzcfo zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzbio zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    public final java.lang.String zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 8)
    public final boolean zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    public final java.lang.String zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.overlay.zzac zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 11)
    public final int zzj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 12)
    public final int zzk;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 13)
    public final java.lang.String zzl;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 14)
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzm;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 16)
    public final java.lang.String zzn;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 17)
    public final com.google.android.gms.ads.internal.zzk zzo;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzbim zzp;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 19)
    public final java.lang.String zzq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 24)
    public final java.lang.String zzr;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 25)
    public final java.lang.String zzs;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzcyn zzt;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzdga zzu;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final com.google.android.gms.internal.ads.zzbtf zzv;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 29)
    public final boolean zzw;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 30)
    public final long zzx;

    static {
            com.google.android.gms.ads.internal.overlay.zzo r0 = new com.google.android.gms.ads.internal.overlay.zzo
            r0.<init>()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.CREATOR = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz = r0
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza r1, com.google.android.gms.ads.internal.overlay.zzr r2, com.google.android.gms.ads.internal.overlay.zzac r3, com.google.android.gms.internal.ads.zzcfo r4, int r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6, java.lang.String r7, com.google.android.gms.ads.internal.zzk r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzcyn r12, com.google.android.gms.internal.ads.zzbtf r13) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r4
            r0.zzp = r1
            r0.zze = r1
            r2 = 0
            r0.zzg = r2
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzaN
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2a
            r0.zzf = r1
            r0.zzh = r1
            goto L2e
        L2a:
            r0.zzf = r9
            r0.zzh = r10
        L2e:
            r0.zzi = r1
            r0.zzj = r5
            r3 = 1
            r0.zzk = r3
            r0.zzl = r1
            r0.zzm = r6
            r0.zzn = r7
            r0.zzo = r8
            r0.zzq = r1
            r0.zzr = r1
            r0.zzs = r11
            r0.zzt = r12
            r0.zzu = r1
            r0.zzv = r13
            r0.zzw = r2
            java.util.concurrent.atomic.AtomicLong r1 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r1 = r1.getAndIncrement()
            r0.zzx = r1
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza r2, com.google.android.gms.ads.internal.overlay.zzr r3, com.google.android.gms.ads.internal.overlay.zzac r4, com.google.android.gms.internal.ads.zzcfo r5, boolean r6, int r7, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r8, com.google.android.gms.internal.ads.zzdga r9, com.google.android.gms.internal.ads.zzbtf r10) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r5
            r1.zzp = r0
            r1.zze = r0
            r1.zzf = r0
            r1.zzg = r6
            r1.zzh = r0
            r1.zzi = r4
            r1.zzj = r7
            r2 = 2
            r1.zzk = r2
            r1.zzl = r0
            r1.zzm = r8
            r1.zzn = r0
            r1.zzo = r0
            r1.zzq = r0
            r1.zzr = r0
            r1.zzs = r0
            r1.zzt = r0
            r1.zzu = r9
            r1.zzv = r10
            r2 = 0
            r1.zzw = r2
            java.util.concurrent.atomic.AtomicLong r2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r2 = r2.getAndIncrement()
            r1.zzx = r2
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza r2, com.google.android.gms.ads.internal.overlay.zzr r3, com.google.android.gms.internal.ads.zzbim r4, com.google.android.gms.internal.ads.zzbio r5, com.google.android.gms.ads.internal.overlay.zzac r6, com.google.android.gms.internal.ads.zzcfo r7, boolean r8, int r9, java.lang.String r10, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r11, com.google.android.gms.internal.ads.zzdga r12, com.google.android.gms.internal.ads.zzbtf r13, boolean r14) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r7
            r1.zzp = r4
            r1.zze = r5
            r1.zzf = r0
            r1.zzg = r8
            r1.zzh = r0
            r1.zzi = r6
            r1.zzj = r9
            r2 = 3
            r1.zzk = r2
            r1.zzl = r10
            r1.zzm = r11
            r1.zzn = r0
            r1.zzo = r0
            r1.zzq = r0
            r1.zzr = r0
            r1.zzs = r0
            r1.zzt = r0
            r1.zzu = r12
            r1.zzv = r13
            r1.zzw = r14
            java.util.concurrent.atomic.AtomicLong r2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r2 = r2.getAndIncrement()
            r1.zzx = r2
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza r2, com.google.android.gms.ads.internal.overlay.zzr r3, com.google.android.gms.internal.ads.zzbim r4, com.google.android.gms.internal.ads.zzbio r5, com.google.android.gms.ads.internal.overlay.zzac r6, com.google.android.gms.internal.ads.zzcfo r7, boolean r8, int r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r12, com.google.android.gms.internal.ads.zzdga r13, com.google.android.gms.internal.ads.zzbtf r14) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r7
            r1.zzp = r4
            r1.zze = r5
            r1.zzf = r11
            r1.zzg = r8
            r1.zzh = r10
            r1.zzi = r6
            r1.zzj = r9
            r2 = 3
            r1.zzk = r2
            r1.zzl = r0
            r1.zzm = r12
            r1.zzn = r0
            r1.zzo = r0
            r1.zzq = r0
            r1.zzr = r0
            r1.zzs = r0
            r1.zzt = r0
            r1.zzu = r13
            r1.zzv = r14
            r2 = 0
            r1.zzw = r2
            java.util.concurrent.atomic.AtomicLong r2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r2 = r2.getAndIncrement()
            r1.zzx = r2
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AdOverlayInfoParcel(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.ads.internal.overlay.zzc r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) android.os.IBinder r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.os.IBinder r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.os.IBinder r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.os.IBinder r10, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) boolean r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) android.os.IBinder r14, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) int r15, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) int r16, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 13) java.lang.String r17, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 14) com.google.android.gms.ads.internal.util.client.VersionInfoParcel r18, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 16) java.lang.String r19, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzk r20, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 18) android.os.IBinder r21, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 19) java.lang.String r22, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 24) java.lang.String r23, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 25) java.lang.String r24, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 26) android.os.IBinder r25, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 27) android.os.IBinder r26, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 28) android.os.IBinder r27, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 29) boolean r28, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 30) long r29) {
            r5 = this;
            r0 = r5
            r5.<init>()
            r1 = r6
            r0.zza = r1
            r1 = r11
            r0.zzf = r1
            r1 = r12
            r0.zzg = r1
            r1 = r13
            r0.zzh = r1
            r1 = r15
            r0.zzj = r1
            r1 = r16
            r0.zzk = r1
            r1 = r17
            r0.zzl = r1
            r1 = r18
            r0.zzm = r1
            r1 = r19
            r0.zzn = r1
            r1 = r20
            r0.zzo = r1
            r1 = r22
            r0.zzq = r1
            r1 = r23
            r0.zzr = r1
            r1 = r24
            r0.zzs = r1
            r1 = r28
            r0.zzw = r1
            r1 = r29
            r0.zzx = r1
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzmx
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r4.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L95
            java.util.concurrent.ConcurrentHashMap r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz
            java.lang.Long r1 = java.lang.Long.valueOf(r29)
            java.lang.Object r1 = r3.remove(r1)
            com.google.android.gms.ads.internal.overlay.zzq r1 = (com.google.android.gms.ads.internal.overlay.zzq) r1
            java.lang.String r2 = "AdOverlayObjects is null"
            java.util.Objects.requireNonNull(r1, r2)
            com.google.android.gms.ads.internal.client.zza r2 = com.google.android.gms.ads.internal.overlay.zzq.zza(r1)
            r0.zzb = r2
            com.google.android.gms.ads.internal.overlay.zzr r2 = com.google.android.gms.ads.internal.overlay.zzq.zze(r1)
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzcfo r2 = com.google.android.gms.ads.internal.overlay.zzq.zzg(r1)
            r0.zzd = r2
            com.google.android.gms.internal.ads.zzbim r2 = com.google.android.gms.ads.internal.overlay.zzq.zzb(r1)
            r0.zzp = r2
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.ads.internal.overlay.zzq.zzc(r1)
            r0.zze = r2
            com.google.android.gms.internal.ads.zzcyn r2 = com.google.android.gms.ads.internal.overlay.zzq.zzh(r1)
            r0.zzt = r2
            com.google.android.gms.internal.ads.zzdga r2 = com.google.android.gms.ads.internal.overlay.zzq.zzi(r1)
            r0.zzu = r2
            com.google.android.gms.internal.ads.zzbtf r2 = com.google.android.gms.ads.internal.overlay.zzq.zzd(r1)
            r0.zzv = r2
            com.google.android.gms.ads.internal.overlay.zzac r1 = com.google.android.gms.ads.internal.overlay.zzq.zzf(r1)
            r0.zzi = r1
            return
        L95:
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r7)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.ads.internal.client.zza r1 = (com.google.android.gms.ads.internal.client.zza) r1
            r0.zzb = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r8)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.ads.internal.overlay.zzr r1 = (com.google.android.gms.ads.internal.overlay.zzr) r1
            r0.zzc = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r9)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzcfo r1 = (com.google.android.gms.internal.ads.zzcfo) r1
            r0.zzd = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r21)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzbim r1 = (com.google.android.gms.internal.ads.zzbim) r1
            r0.zzp = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r10)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzbio r1 = (com.google.android.gms.internal.ads.zzbio) r1
            r0.zze = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r14)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.ads.internal.overlay.zzac r1 = (com.google.android.gms.ads.internal.overlay.zzac) r1
            r0.zzi = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r25)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzcyn r1 = (com.google.android.gms.internal.ads.zzcyn) r1
            r0.zzt = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r26)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzdga r1 = (com.google.android.gms.internal.ads.zzdga) r1
            r0.zzu = r1
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r27)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            com.google.android.gms.internal.ads.zzbtf r1 = (com.google.android.gms.internal.ads.zzbtf) r1
            r0.zzv = r1
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.overlay.zzc r1, com.google.android.gms.ads.internal.client.zza r2, com.google.android.gms.ads.internal.overlay.zzr r3, com.google.android.gms.ads.internal.overlay.zzac r4, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5, com.google.android.gms.internal.ads.zzcfo r6, com.google.android.gms.internal.ads.zzdga r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r6
            r1 = 0
            r0.zzp = r1
            r0.zze = r1
            r0.zzf = r1
            r2 = 0
            r0.zzg = r2
            r0.zzh = r1
            r0.zzi = r4
            r3 = -1
            r0.zzj = r3
            r3 = 4
            r0.zzk = r3
            r0.zzl = r1
            r0.zzm = r5
            r0.zzn = r1
            r0.zzo = r1
            r0.zzq = r1
            r0.zzr = r1
            r0.zzs = r1
            r0.zzt = r1
            r0.zzu = r7
            r0.zzv = r1
            r0.zzw = r2
            java.util.concurrent.atomic.AtomicLong r1 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r1 = r1.getAndIncrement()
            r0.zzx = r1
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.overlay.zzr r1, com.google.android.gms.internal.ads.zzcfo r2, int r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            r1 = 1
            r0.zzj = r1
            r0.zzm = r4
            r2 = 0
            r0.zza = r2
            r0.zzb = r2
            r0.zzp = r2
            r0.zze = r2
            r0.zzf = r2
            r3 = 0
            r0.zzg = r3
            r0.zzh = r2
            r0.zzi = r2
            r0.zzk = r1
            r0.zzl = r2
            r0.zzn = r2
            r0.zzo = r2
            r0.zzq = r2
            r0.zzr = r2
            r0.zzs = r2
            r0.zzt = r2
            r0.zzu = r2
            r0.zzv = r2
            r0.zzw = r3
            java.util.concurrent.atomic.AtomicLong r1 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r1 = r1.getAndIncrement()
            r0.zzx = r1
            return
    }

    public AdOverlayInfoParcel(com.google.android.gms.internal.ads.zzcfo r2, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r3, java.lang.String r4, java.lang.String r5, int r6, com.google.android.gms.internal.ads.zzbtf r7) {
            r1 = this;
            r1.<init>()
            r6 = 0
            r1.zza = r6
            r1.zzb = r6
            r1.zzc = r6
            r1.zzd = r2
            r1.zzp = r6
            r1.zze = r6
            r1.zzf = r6
            r2 = 0
            r1.zzg = r2
            r1.zzh = r6
            r1.zzi = r6
            r0 = 14
            r1.zzj = r0
            r0 = 5
            r1.zzk = r0
            r1.zzl = r6
            r1.zzm = r3
            r1.zzn = r6
            r1.zzo = r6
            r1.zzq = r4
            r1.zzr = r5
            r1.zzs = r6
            r1.zzt = r6
            r1.zzu = r6
            r1.zzv = r7
            r1.zzw = r2
            java.util.concurrent.atomic.AtomicLong r2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzy
            long r2 = r2.getAndIncrement()
            r1.zzx = r2
            return
    }

    public static com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zzb(android.content.Intent r2) {
            java.lang.String r0 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"
            android.os.Bundle r2 = r2.getBundleExtra(r0)     // Catch: java.lang.Exception -> L16
            java.lang.Class<com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel> r1 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L16
            r2.setClassLoader(r1)     // Catch: java.lang.Exception -> L16
            android.os.Parcelable r2 = r2.getParcelable(r0)     // Catch: java.lang.Exception -> L16
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r2 = (com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel) r2     // Catch: java.lang.Exception -> L16
            return r2
        L16:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L32
            com.google.android.gms.internal.ads.zzcad r0 = com.google.android.gms.ads.internal.zzu.zzo()
            java.lang.String r1 = "AdOverlayInfoParcel.getFromIntent"
            r0.zzw(r2, r1)
        L32:
            r2 = 0
            return r2
    }

    private static final android.os.IBinder zzc(java.lang.Object r2) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmx
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L14
            r2 = 0
            return r2
        L14:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)
            android.os.IBinder r2 = r2.asBinder()
            return r2
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r12, int r13) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r12)
            com.google.android.gms.ads.internal.overlay.zzc r1 = r11.zza
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r12, r2, r1, r13, r3)
            com.google.android.gms.ads.internal.client.zza r1 = r11.zzb
            android.os.IBinder r1 = zzc(r1)
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r2, r1, r3)
            com.google.android.gms.ads.internal.overlay.zzr r1 = r11.zzc
            android.os.IBinder r1 = zzc(r1)
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r2, r1, r3)
            com.google.android.gms.internal.ads.zzcfo r1 = r11.zzd
            android.os.IBinder r1 = zzc(r1)
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r2, r1, r3)
            com.google.android.gms.internal.ads.zzbio r1 = r11.zze
            android.os.IBinder r1 = zzc(r1)
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r2, r1, r3)
            java.lang.String r1 = r11.zzf
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r2, r1, r3)
            boolean r1 = r11.zzg
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r12, r2, r1)
            java.lang.String r1 = r11.zzh
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r2, r1, r3)
            com.google.android.gms.ads.internal.overlay.zzac r1 = r11.zzi
            android.os.IBinder r1 = zzc(r1)
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r2, r1, r3)
            int r1 = r11.zzj
            r2 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r12, r2, r1)
            int r1 = r11.zzk
            r2 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r12, r2, r1)
            java.lang.String r1 = r11.zzl
            r2 = 13
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r2, r1, r3)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r11.zzm
            r2 = 14
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r12, r2, r1, r13, r3)
            java.lang.String r1 = r11.zzn
            r2 = 16
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r2, r1, r3)
            com.google.android.gms.ads.internal.zzk r1 = r11.zzo
            r2 = 17
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r12, r2, r1, r13, r3)
            com.google.android.gms.internal.ads.zzbim r13 = r11.zzp
            android.os.IBinder r13 = zzc(r13)
            r1 = 18
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r1, r13, r3)
            java.lang.String r13 = r11.zzq
            r1 = 19
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r1, r13, r3)
            java.lang.String r13 = r11.zzr
            r1 = 24
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r1, r13, r3)
            java.lang.String r13 = r11.zzs
            r1 = 25
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r12, r1, r13, r3)
            com.google.android.gms.internal.ads.zzcyn r13 = r11.zzt
            android.os.IBinder r13 = zzc(r13)
            r1 = 26
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r1, r13, r3)
            com.google.android.gms.internal.ads.zzdga r13 = r11.zzu
            android.os.IBinder r13 = zzc(r13)
            r1 = 27
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r1, r13, r3)
            com.google.android.gms.internal.ads.zzbtf r13 = r11.zzv
            android.os.IBinder r13 = zzc(r13)
            r1 = 28
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r12, r1, r13, r3)
            boolean r13 = r11.zzw
            r1 = 29
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r12, r1, r13)
            long r1 = r11.zzx
            r13 = 30
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r12, r13, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r12, r0)
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzmx
            com.google.android.gms.internal.ads.zzbct r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r13.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L120
            long r12 = r11.zzx
            com.google.android.gms.ads.internal.client.zza r1 = r11.zzb
            com.google.android.gms.ads.internal.overlay.zzr r2 = r11.zzc
            com.google.android.gms.internal.ads.zzcfo r3 = r11.zzd
            com.google.android.gms.internal.ads.zzbim r4 = r11.zzp
            com.google.android.gms.internal.ads.zzbio r5 = r11.zze
            com.google.android.gms.ads.internal.overlay.zzac r6 = r11.zzi
            com.google.android.gms.internal.ads.zzcyn r7 = r11.zzt
            com.google.android.gms.internal.ads.zzdga r8 = r11.zzu
            com.google.android.gms.internal.ads.zzbtf r9 = r11.zzv
            java.util.concurrent.ConcurrentHashMap r10 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            com.google.android.gms.ads.internal.overlay.zzq r13 = new com.google.android.gms.ads.internal.overlay.zzq
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.put(r12, r13)
            java.util.concurrent.ScheduledExecutorService r12 = com.google.android.gms.internal.ads.zzcan.zzd
            com.google.android.gms.ads.internal.overlay.zzp r13 = new com.google.android.gms.ads.internal.overlay.zzp
            r13.<init>(r11)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzmy
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r12.schedule(r13, r0, r2)
        L120:
            return
    }

    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzq zza() throws java.lang.Exception {
            r3 = this;
            long r0 = r3.zzx
            java.util.concurrent.ConcurrentHashMap r2 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zzz
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.remove(r0)
            com.google.android.gms.ads.internal.overlay.zzq r0 = (com.google.android.gms.ads.internal.overlay.zzq) r0
            return r0
    }
}
