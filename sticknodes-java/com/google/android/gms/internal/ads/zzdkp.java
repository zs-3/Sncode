package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdkp {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.internal.ads.zzbfv zzc;
    private android.view.View zzd;
    private java.util.List zze;
    private java.util.List zzf;
    private com.google.android.gms.ads.internal.client.zzfa zzg;
    private android.os.Bundle zzh;
    private com.google.android.gms.internal.ads.zzcfo zzi;
    private com.google.android.gms.internal.ads.zzcfo zzj;
    private com.google.android.gms.internal.ads.zzcfo zzk;
    private com.google.android.gms.internal.ads.zzegf zzl;
    private com.google.common.util.concurrent.ListenableFuture zzm;
    private com.google.android.gms.internal.ads.zzcas zzn;
    private android.view.View zzo;
    private android.view.View zzp;
    private com.google.android.gms.dynamic.IObjectWrapper zzq;
    private double zzr;
    private com.google.android.gms.internal.ads.zzbgc zzs;
    private com.google.android.gms.internal.ads.zzbgc zzt;
    private java.lang.String zzu;
    private final androidx.collection.SimpleArrayMap zzv;
    private final androidx.collection.SimpleArrayMap zzw;
    private float zzx;
    private java.lang.String zzy;

    public zzdkp() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.zzv = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.zzw = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r1.zzf = r0
            return
    }

    public static com.google.android.gms.internal.ads.zzdkp zzag(com.google.android.gms.internal.ads.zzbpw r16) {
            r1 = 0
            com.google.android.gms.ads.internal.client.zzeb r0 = r16.zzg()     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzdko r0 = zzak(r0, r1)     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzbfv r2 = r16.zzh()     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.dynamic.IObjectWrapper r3 = r16.zzj()     // Catch: android.os.RemoteException -> L81
            java.lang.Object r3 = zzam(r3)     // Catch: android.os.RemoteException -> L81
            android.view.View r3 = (android.view.View) r3     // Catch: android.os.RemoteException -> L81
            java.lang.String r4 = r16.zzo()     // Catch: android.os.RemoteException -> L81
            java.util.List r5 = r16.zzr()     // Catch: android.os.RemoteException -> L81
            java.lang.String r6 = r16.zzm()     // Catch: android.os.RemoteException -> L81
            android.os.Bundle r7 = r16.zzf()     // Catch: android.os.RemoteException -> L81
            java.lang.String r8 = r16.zzn()     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.dynamic.IObjectWrapper r9 = r16.zzk()     // Catch: android.os.RemoteException -> L81
            java.lang.Object r9 = zzam(r9)     // Catch: android.os.RemoteException -> L81
            android.view.View r9 = (android.view.View) r9     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.dynamic.IObjectWrapper r10 = r16.zzl()     // Catch: android.os.RemoteException -> L81
            java.lang.String r11 = r16.zzq()     // Catch: android.os.RemoteException -> L81
            java.lang.String r12 = r16.zzp()     // Catch: android.os.RemoteException -> L81
            double r13 = r16.zze()     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzbgc r15 = r16.zzi()     // Catch: android.os.RemoteException -> L81
            com.google.android.gms.internal.ads.zzdkp r1 = new com.google.android.gms.internal.ads.zzdkp     // Catch: android.os.RemoteException -> L81
            r1.<init>()     // Catch: android.os.RemoteException -> L81
            r16 = r15
            r15 = 2
            r1.zza = r15     // Catch: android.os.RemoteException -> L81
            r1.zzb = r0     // Catch: android.os.RemoteException -> L81
            r1.zzc = r2     // Catch: android.os.RemoteException -> L81
            r1.zzd = r3     // Catch: android.os.RemoteException -> L81
            java.lang.String r0 = "headline"
            r1.zzZ(r0, r4)     // Catch: android.os.RemoteException -> L81
            r1.zze = r5     // Catch: android.os.RemoteException -> L81
            java.lang.String r0 = "body"
            r1.zzZ(r0, r6)     // Catch: android.os.RemoteException -> L81
            r1.zzh = r7     // Catch: android.os.RemoteException -> L81
            java.lang.String r0 = "call_to_action"
            r1.zzZ(r0, r8)     // Catch: android.os.RemoteException -> L81
            r1.zzo = r9     // Catch: android.os.RemoteException -> L81
            r1.zzq = r10     // Catch: android.os.RemoteException -> L81
            java.lang.String r0 = "store"
            r1.zzZ(r0, r11)     // Catch: android.os.RemoteException -> L81
            java.lang.String r0 = "price"
            r1.zzZ(r0, r12)     // Catch: android.os.RemoteException -> L81
            r1.zzr = r13     // Catch: android.os.RemoteException -> L81
            r0 = r16
            r1.zzs = r0     // Catch: android.os.RemoteException -> L81
            return r1
        L81:
            r0 = move-exception
            java.lang.String r1 = "Failed to get native ad from app install ad mapper"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            r1 = 0
            return r1
    }

    public static com.google.android.gms.internal.ads.zzdkp zzah(com.google.android.gms.internal.ads.zzbpx r14) {
            r0 = 0
            com.google.android.gms.ads.internal.client.zzeb r1 = r14.zzf()     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.internal.ads.zzdko r1 = zzak(r1, r0)     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.internal.ads.zzbfv r2 = r14.zzg()     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.dynamic.IObjectWrapper r3 = r14.zzi()     // Catch: android.os.RemoteException -> L6e
            java.lang.Object r3 = zzam(r3)     // Catch: android.os.RemoteException -> L6e
            android.view.View r3 = (android.view.View) r3     // Catch: android.os.RemoteException -> L6e
            java.lang.String r4 = r14.zzo()     // Catch: android.os.RemoteException -> L6e
            java.util.List r5 = r14.zzp()     // Catch: android.os.RemoteException -> L6e
            java.lang.String r6 = r14.zzm()     // Catch: android.os.RemoteException -> L6e
            android.os.Bundle r7 = r14.zze()     // Catch: android.os.RemoteException -> L6e
            java.lang.String r8 = r14.zzn()     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.dynamic.IObjectWrapper r9 = r14.zzj()     // Catch: android.os.RemoteException -> L6e
            java.lang.Object r9 = zzam(r9)     // Catch: android.os.RemoteException -> L6e
            android.view.View r9 = (android.view.View) r9     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.dynamic.IObjectWrapper r10 = r14.zzk()     // Catch: android.os.RemoteException -> L6e
            java.lang.String r11 = r14.zzl()     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.internal.ads.zzbgc r14 = r14.zzh()     // Catch: android.os.RemoteException -> L6e
            com.google.android.gms.internal.ads.zzdkp r12 = new com.google.android.gms.internal.ads.zzdkp     // Catch: android.os.RemoteException -> L6e
            r12.<init>()     // Catch: android.os.RemoteException -> L6e
            r13 = 1
            r12.zza = r13     // Catch: android.os.RemoteException -> L6e
            r12.zzb = r1     // Catch: android.os.RemoteException -> L6e
            r12.zzc = r2     // Catch: android.os.RemoteException -> L6e
            r12.zzd = r3     // Catch: android.os.RemoteException -> L6e
            java.lang.String r1 = "headline"
            r12.zzZ(r1, r4)     // Catch: android.os.RemoteException -> L6e
            r12.zze = r5     // Catch: android.os.RemoteException -> L6e
            java.lang.String r1 = "body"
            r12.zzZ(r1, r6)     // Catch: android.os.RemoteException -> L6e
            r12.zzh = r7     // Catch: android.os.RemoteException -> L6e
            java.lang.String r1 = "call_to_action"
            r12.zzZ(r1, r8)     // Catch: android.os.RemoteException -> L6e
            r12.zzo = r9     // Catch: android.os.RemoteException -> L6e
            r12.zzq = r10     // Catch: android.os.RemoteException -> L6e
            java.lang.String r1 = "advertiser"
            r12.zzZ(r1, r11)     // Catch: android.os.RemoteException -> L6e
            r12.zzt = r14     // Catch: android.os.RemoteException -> L6e
            return r12
        L6e:
            r14 = move-exception
            java.lang.String r1 = "Failed to get native ad from content ad mapper"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r14)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzdkp zzai(com.google.android.gms.internal.ads.zzbpw r19) {
            r1 = 0
            com.google.android.gms.ads.internal.client.zzeb r0 = r19.zzg()     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.internal.ads.zzdko r2 = zzak(r0, r1)     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.internal.ads.zzbfv r3 = r19.zzh()     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.dynamic.IObjectWrapper r0 = r19.zzj()     // Catch: android.os.RemoteException -> L54
            java.lang.Object r0 = zzam(r0)     // Catch: android.os.RemoteException -> L54
            r4 = r0
            android.view.View r4 = (android.view.View) r4     // Catch: android.os.RemoteException -> L54
            java.lang.String r5 = r19.zzo()     // Catch: android.os.RemoteException -> L54
            java.util.List r6 = r19.zzr()     // Catch: android.os.RemoteException -> L54
            java.lang.String r7 = r19.zzm()     // Catch: android.os.RemoteException -> L54
            android.os.Bundle r8 = r19.zzf()     // Catch: android.os.RemoteException -> L54
            java.lang.String r9 = r19.zzn()     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.dynamic.IObjectWrapper r0 = r19.zzk()     // Catch: android.os.RemoteException -> L54
            java.lang.Object r0 = zzam(r0)     // Catch: android.os.RemoteException -> L54
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.dynamic.IObjectWrapper r11 = r19.zzl()     // Catch: android.os.RemoteException -> L54
            java.lang.String r12 = r19.zzq()     // Catch: android.os.RemoteException -> L54
            java.lang.String r13 = r19.zzp()     // Catch: android.os.RemoteException -> L54
            double r14 = r19.zze()     // Catch: android.os.RemoteException -> L54
            com.google.android.gms.internal.ads.zzbgc r16 = r19.zzi()     // Catch: android.os.RemoteException -> L54
            r17 = 0
            r18 = 0
            com.google.android.gms.internal.ads.zzdkp r0 = zzal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)     // Catch: android.os.RemoteException -> L54
            return r0
        L54:
            r0 = move-exception
            java.lang.String r2 = "Failed to get native ad assets from app install ad mapper"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
            return r1
    }

    public static com.google.android.gms.internal.ads.zzdkp zzaj(com.google.android.gms.internal.ads.zzbpx r19) {
            r1 = 0
            com.google.android.gms.ads.internal.client.zzeb r0 = r19.zzf()     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.internal.ads.zzdko r2 = zzak(r0, r1)     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.internal.ads.zzbfv r3 = r19.zzg()     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.dynamic.IObjectWrapper r0 = r19.zzi()     // Catch: android.os.RemoteException -> L4e
            java.lang.Object r0 = zzam(r0)     // Catch: android.os.RemoteException -> L4e
            r4 = r0
            android.view.View r4 = (android.view.View) r4     // Catch: android.os.RemoteException -> L4e
            java.lang.String r5 = r19.zzo()     // Catch: android.os.RemoteException -> L4e
            java.util.List r6 = r19.zzp()     // Catch: android.os.RemoteException -> L4e
            java.lang.String r7 = r19.zzm()     // Catch: android.os.RemoteException -> L4e
            android.os.Bundle r8 = r19.zze()     // Catch: android.os.RemoteException -> L4e
            java.lang.String r9 = r19.zzn()     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.dynamic.IObjectWrapper r0 = r19.zzj()     // Catch: android.os.RemoteException -> L4e
            java.lang.Object r0 = zzam(r0)     // Catch: android.os.RemoteException -> L4e
            r10 = r0
            android.view.View r10 = (android.view.View) r10     // Catch: android.os.RemoteException -> L4e
            com.google.android.gms.dynamic.IObjectWrapper r11 = r19.zzk()     // Catch: android.os.RemoteException -> L4e
            r12 = 0
            r13 = 0
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            com.google.android.gms.internal.ads.zzbgc r16 = r19.zzh()     // Catch: android.os.RemoteException -> L4e
            java.lang.String r17 = r19.zzl()     // Catch: android.os.RemoteException -> L4e
            r18 = 0
            com.google.android.gms.internal.ads.zzdkp r0 = zzal(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)     // Catch: android.os.RemoteException -> L4e
            return r0
        L4e:
            r0 = move-exception
            java.lang.String r2 = "Failed to get native ad assets from content ad mapper"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r2, r0)
            return r1
    }

    private static com.google.android.gms.internal.ads.zzdko zzak(com.google.android.gms.ads.internal.client.zzeb r1, com.google.android.gms.internal.ads.zzbqa r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.google.android.gms.internal.ads.zzdko r0 = new com.google.android.gms.internal.ads.zzdko
            r0.<init>(r1, r2)
            return r0
    }

    private static com.google.android.gms.internal.ads.zzdkp zzal(com.google.android.gms.ads.internal.client.zzeb r3, com.google.android.gms.internal.ads.zzbfv r4, android.view.View r5, java.lang.String r6, java.util.List r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10, android.view.View r11, com.google.android.gms.dynamic.IObjectWrapper r12, java.lang.String r13, java.lang.String r14, double r15, com.google.android.gms.internal.ads.zzbgc r17, java.lang.String r18, float r19) {
            com.google.android.gms.internal.ads.zzdkp r0 = new com.google.android.gms.internal.ads.zzdkp
            r0.<init>()
            r1 = 6
            r0.zza = r1
            r1 = r3
            r0.zzb = r1
            r1 = r4
            r0.zzc = r1
            r1 = r5
            r0.zzd = r1
            java.lang.String r1 = "headline"
            r2 = r6
            r0.zzZ(r1, r6)
            r1 = r7
            r0.zze = r1
            java.lang.String r1 = "body"
            r2 = r8
            r0.zzZ(r1, r8)
            r1 = r9
            r0.zzh = r1
            java.lang.String r1 = "call_to_action"
            r2 = r10
            r0.zzZ(r1, r10)
            r1 = r11
            r0.zzo = r1
            r1 = r12
            r0.zzq = r1
            java.lang.String r1 = "store"
            r2 = r13
            r0.zzZ(r1, r13)
            java.lang.String r1 = "price"
            r2 = r14
            r0.zzZ(r1, r14)
            r1 = r15
            r0.zzr = r1
            r1 = r17
            r0.zzs = r1
            java.lang.String r1 = "advertiser"
            r2 = r18
            r0.zzZ(r1, r2)
            r1 = r19
            r0.zzR(r1)
            return r0
    }

    private static java.lang.Object zzam(com.google.android.gms.dynamic.IObjectWrapper r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Object r0 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r0)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzdkp zzt(com.google.android.gms.internal.ads.zzbqa r18) {
            com.google.android.gms.ads.internal.client.zzeb r0 = r18.zzj()     // Catch: android.os.RemoteException -> L58
            r1 = r18
            com.google.android.gms.internal.ads.zzdko r0 = zzak(r0, r1)     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.internal.ads.zzbfv r2 = r18.zzk()     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.dynamic.IObjectWrapper r3 = r18.zzm()     // Catch: android.os.RemoteException -> L58
            java.lang.Object r3 = zzam(r3)     // Catch: android.os.RemoteException -> L58
            android.view.View r3 = (android.view.View) r3     // Catch: android.os.RemoteException -> L58
            java.lang.String r4 = r18.zzs()     // Catch: android.os.RemoteException -> L58
            java.util.List r5 = r18.zzv()     // Catch: android.os.RemoteException -> L58
            java.lang.String r6 = r18.zzq()     // Catch: android.os.RemoteException -> L58
            android.os.Bundle r7 = r18.zzi()     // Catch: android.os.RemoteException -> L58
            java.lang.String r8 = r18.zzr()     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.dynamic.IObjectWrapper r9 = r18.zzn()     // Catch: android.os.RemoteException -> L58
            java.lang.Object r9 = zzam(r9)     // Catch: android.os.RemoteException -> L58
            android.view.View r9 = (android.view.View) r9     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.dynamic.IObjectWrapper r10 = r18.zzo()     // Catch: android.os.RemoteException -> L58
            java.lang.String r11 = r18.zzu()     // Catch: android.os.RemoteException -> L58
            java.lang.String r12 = r18.zzt()     // Catch: android.os.RemoteException -> L58
            double r13 = r18.zze()     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.internal.ads.zzbgc r15 = r18.zzl()     // Catch: android.os.RemoteException -> L58
            java.lang.String r16 = r18.zzp()     // Catch: android.os.RemoteException -> L58
            float r17 = r18.zzf()     // Catch: android.os.RemoteException -> L58
            r1 = r0
            com.google.android.gms.internal.ads.zzdkp r0 = zzal(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17)     // Catch: android.os.RemoteException -> L58
            return r0
        L58:
            r0 = move-exception
            java.lang.String r1 = "Failed to get native ad assets from unified ad mapper"
            com.google.android.gms.ads.internal.util.client.zzm.zzk(r1, r0)
            r0 = 0
            return r0
    }

    public final synchronized java.lang.String zzA() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzu     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzB() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "headline"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzC() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.zzy     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzD() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "price"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzE() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "store"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzF(java.lang.String r2) {
            r1 = this;
            monitor-enter(r1)
            androidx.collection.SimpleArrayMap r0 = r1.zzw     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return r2
        Lb:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized java.util.List zzG() {
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.zze     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.util.List zzH() {
            r1 = this;
            monitor-enter(r1)
            java.util.List r0 = r1.zzf     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized void zzI() {
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzi     // Catch: java.lang.Throwable -> L54
            r1 = 0
            if (r0 == 0) goto Lb
            r0.destroy()     // Catch: java.lang.Throwable -> L54
            r3.zzi = r1     // Catch: java.lang.Throwable -> L54
        Lb:
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzj     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L14
            r0.destroy()     // Catch: java.lang.Throwable -> L54
            r3.zzj = r1     // Catch: java.lang.Throwable -> L54
        L14:
            com.google.android.gms.internal.ads.zzcfo r0 = r3.zzk     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L1d
            r0.destroy()     // Catch: java.lang.Throwable -> L54
            r3.zzk = r1     // Catch: java.lang.Throwable -> L54
        L1d:
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zzm     // Catch: java.lang.Throwable -> L54
            r2 = 0
            if (r0 == 0) goto L27
            r0.cancel(r2)     // Catch: java.lang.Throwable -> L54
            r3.zzm = r1     // Catch: java.lang.Throwable -> L54
        L27:
            com.google.android.gms.internal.ads.zzcas r0 = r3.zzn     // Catch: java.lang.Throwable -> L54
            if (r0 == 0) goto L30
            r0.cancel(r2)     // Catch: java.lang.Throwable -> L54
            r3.zzn = r1     // Catch: java.lang.Throwable -> L54
        L30:
            r3.zzl = r1     // Catch: java.lang.Throwable -> L54
            androidx.collection.SimpleArrayMap r0 = r3.zzv     // Catch: java.lang.Throwable -> L54
            r0.clear()     // Catch: java.lang.Throwable -> L54
            androidx.collection.SimpleArrayMap r0 = r3.zzw     // Catch: java.lang.Throwable -> L54
            r0.clear()     // Catch: java.lang.Throwable -> L54
            r3.zzb = r1     // Catch: java.lang.Throwable -> L54
            r3.zzc = r1     // Catch: java.lang.Throwable -> L54
            r3.zzd = r1     // Catch: java.lang.Throwable -> L54
            r3.zze = r1     // Catch: java.lang.Throwable -> L54
            r3.zzh = r1     // Catch: java.lang.Throwable -> L54
            r3.zzo = r1     // Catch: java.lang.Throwable -> L54
            r3.zzp = r1     // Catch: java.lang.Throwable -> L54
            r3.zzq = r1     // Catch: java.lang.Throwable -> L54
            r3.zzs = r1     // Catch: java.lang.Throwable -> L54
            r3.zzt = r1     // Catch: java.lang.Throwable -> L54
            r3.zzu = r1     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)
            return
        L54:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final synchronized void zzJ(com.google.android.gms.internal.ads.zzbfv r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzc = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzK(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzu = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzfa r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzg = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzM(com.google.android.gms.internal.ads.zzbgc r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzs = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzN(java.lang.String r2, com.google.android.gms.internal.ads.zzbfp r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto La
            androidx.collection.SimpleArrayMap r3 = r1.zzv     // Catch: java.lang.Throwable -> L11
            r3.remove(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        La:
            androidx.collection.SimpleArrayMap r0 = r1.zzv     // Catch: java.lang.Throwable -> L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized void zzO(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzj = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzP(java.util.List r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zze = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzQ(com.google.android.gms.internal.ads.zzbgc r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzt = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzR(float r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzx = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzS(java.util.List r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzf = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzT(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzk = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzU(com.google.common.util.concurrent.ListenableFuture r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzm = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzV(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzy = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzW(com.google.android.gms.internal.ads.zzegf r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzl = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzX(com.google.android.gms.internal.ads.zzcas r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzn = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzY(double r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzr = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzZ(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            monitor-enter(r1)
            if (r3 != 0) goto La
            androidx.collection.SimpleArrayMap r3 = r1.zzw     // Catch: java.lang.Throwable -> L11
            r3.remove(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        La:
            androidx.collection.SimpleArrayMap r0 = r1.zzw     // Catch: java.lang.Throwable -> L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final synchronized double zza() {
            r2 = this;
            monitor-enter(r2)
            double r0 = r2.zzr     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final synchronized void zzaa(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zza = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzb = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzac(android.view.View r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzo = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzad(com.google.android.gms.internal.ads.zzcfo r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzi = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized void zzae(android.view.View r1) {
            r0 = this;
            monitor-enter(r0)
            r0.zzp = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final synchronized boolean zzaf() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzj     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8
            r0 = 1
        L6:
            monitor-exit(r1)
            return r0
        L8:
            r0 = 0
            goto L6
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized float zzb() {
            r1 = this;
            monitor-enter(r1)
            float r0 = r1.zzx     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized int zzc() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.zza     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized android.os.Bundle zzd() {
            r1 = this;
            monitor-enter(r1)
            android.os.Bundle r0 = r1.zzh     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto Lc
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> L10
            r0.<init>()     // Catch: java.lang.Throwable -> L10
            r1.zzh = r0     // Catch: java.lang.Throwable -> L10
        Lc:
            android.os.Bundle r0 = r1.zzh     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized android.view.View zze() {
            r1 = this;
            monitor-enter(r1)
            android.view.View r0 = r1.zzd     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized android.view.View zzf() {
            r1 = this;
            monitor-enter(r1)
            android.view.View r0 = r1.zzo     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized android.view.View zzg() {
            r1 = this;
            monitor-enter(r1)
            android.view.View r0 = r1.zzp     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized androidx.collection.SimpleArrayMap zzh() {
            r1 = this;
            monitor-enter(r1)
            androidx.collection.SimpleArrayMap r0 = r1.zzv     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized androidx.collection.SimpleArrayMap zzi() {
            r1 = this;
            monitor-enter(r1)
            androidx.collection.SimpleArrayMap r0 = r1.zzw     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.client.zzeb r0 = r1.zzb     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzfa zzk() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.internal.client.zzfa r0 = r1.zzg     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzbfv zzl() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbfv r0 = r1.zzc     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final com.google.android.gms.internal.ads.zzbgc zzm() {
            r2 = this;
            java.util.List r0 = r2.zze
            if (r0 == 0) goto L1d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L1d
        Lb:
            java.util.List r0 = r2.zze
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof android.os.IBinder
            if (r1 == 0) goto L1d
            android.os.IBinder r0 = (android.os.IBinder) r0
            com.google.android.gms.internal.ads.zzbgc r0 = com.google.android.gms.internal.ads.zzbgb.zzg(r0)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzbgc zzn() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbgc r0 = r1.zzs     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzbgc zzo() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbgc r0 = r1.zzt     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzcas zzp() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcas r0 = r1.zzn     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzcfo zzq() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzj     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzcfo zzr() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzk     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzcfo zzs() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcfo r0 = r1.zzi     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.internal.ads.zzegf zzu() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzegf r0 = r1.zzl     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.android.gms.dynamic.IObjectWrapper zzv() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.dynamic.IObjectWrapper r0 = r1.zzq     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzw() {
            r1 = this;
            monitor-enter(r1)
            com.google.common.util.concurrent.ListenableFuture r0 = r1.zzm     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzx() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "advertiser"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzy() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "body"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public final synchronized java.lang.String zzz() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "call_to_action"
            java.lang.String r0 = r1.zzF(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
