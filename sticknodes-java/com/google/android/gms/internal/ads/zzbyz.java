package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbyz {
    final java.util.concurrent.atomic.AtomicBoolean zza;
    private final java.util.concurrent.atomic.AtomicReference zzb;
    private final java.lang.Object zzc;
    private java.lang.String zzd;
    private final java.util.concurrent.atomic.AtomicInteger zze;
    private final java.util.concurrent.atomic.AtomicReference zzf;
    private final java.util.concurrent.atomic.AtomicReference zzg;
    private final java.util.concurrent.ConcurrentMap zzh;
    private final java.lang.Object zzi;

    public zzbyz() {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r1 = 0
            r0.<init>(r1)
            r3.zzb = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzc = r0
            r3.zzd = r1
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            r3.zza = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r2 = -1
            r0.<init>(r2)
            r3.zze = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            r3.zzf = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            r3.zzg = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r2 = 9
            r0.<init>(r2)
            r3.zzh = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>(r1)
            java.util.concurrent.ArrayBlockingQueue r0 = new java.util.concurrent.ArrayBlockingQueue
            r1 = 20
            r0.<init>(r1)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzi = r0
            return
    }

    public static final android.os.Bundle zzq(java.util.Map r5) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r5 != 0) goto L8
            goto L3e
        L8:
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "value"
            boolean r3 = java.util.Objects.equals(r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L32
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3c
            double r3 = java.lang.Double.parseDouble(r3)     // Catch: java.lang.Throwable -> L3c
            r0.putDouble(r2, r3)     // Catch: java.lang.Throwable -> L3c
            goto L10
        L32:
            java.lang.Object r3 = r5.get(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3c
            r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L3c
            goto L10
        L3c:
            goto L10
        L3e:
            return r0
    }

    static final boolean zzr(android.content.Context r4) {
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzap
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4a
            java.lang.String r0 = "com.google.android.gms.ads.dynamite"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r4, r0)
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzaq
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r0 >= r2) goto L2c
            return r1
        L2c:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzar
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L49
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L49
            java.lang.String r0 = "com.google.firebase.analytics.FirebaseAnalytics"
            r4.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L49
            return r1
        L49:
            return r2
        L4a:
            return r1
    }

    private final java.lang.Object zzs(java.lang.String r5, android.content.Context r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.zzf
            java.lang.String r1 = "com.google.android.gms.measurement.AppMeasurement"
            r2 = 1
            boolean r0 = r4.zzx(r6, r1, r0, r2)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.lang.reflect.Method r6 = r4.zzt(r6, r5)
            java.util.concurrent.atomic.AtomicReference r0 = r4.zzf     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1f
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L1f
            java.lang.Object r5 = r6.invoke(r0, r3)     // Catch: java.lang.Exception -> L1f
            return r5
        L1f:
            r4.zzw(r5, r2)
            return r1
    }

    private final java.lang.reflect.Method zzt(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap r0 = r2.zzh
            java.lang.Object r0 = r0.get(r4)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "com.google.android.gms.measurement.AppMeasurement"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch: java.lang.Exception -> L22
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r1)     // Catch: java.lang.Exception -> L22
            java.util.concurrent.ConcurrentMap r1 = r2.zzh     // Catch: java.lang.Exception -> L22
            r1.put(r4, r3)     // Catch: java.lang.Exception -> L22
            return r3
        L22:
            r2.zzw(r4, r0)
            r3 = 0
            return r3
    }

    private final void zzu(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r4.zzf
            java.lang.String r1 = "com.google.android.gms.measurement.AppMeasurement"
            r2 = 1
            boolean r0 = r4.zzx(r5, r1, r0, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.util.concurrent.ConcurrentMap r0 = r4.zzh
            java.lang.Object r0 = r0.get(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r3 = 0
            if (r0 == 0) goto L18
            goto L34
        L18:
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L30
            java.lang.Class r5 = r5.loadClass(r1)     // Catch: java.lang.Exception -> L30
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L30
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r3] = r1     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r7, r0)     // Catch: java.lang.Exception -> L30
            java.util.concurrent.ConcurrentMap r5 = r4.zzh     // Catch: java.lang.Exception -> L30
            r5.put(r7, r0)     // Catch: java.lang.Exception -> L30
            goto L34
        L30:
            r4.zzw(r7, r3)
            r0 = 0
        L34:
            java.util.concurrent.atomic.AtomicReference r5 = r4.zzf     // Catch: java.lang.Exception -> L5e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L5e
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5e
            r1[r3] = r6     // Catch: java.lang.Exception -> L5e
            r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L5e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5e
            r5.<init>()     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = "Invoke Firebase method "
            r5.append(r0)     // Catch: java.lang.Exception -> L5e
            r5.append(r7)     // Catch: java.lang.Exception -> L5e
            java.lang.String r0 = ", Ad Unit Id: "
            r5.append(r0)     // Catch: java.lang.Exception -> L5e
            r5.append(r6)     // Catch: java.lang.Exception -> L5e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L5e
            com.google.android.gms.ads.internal.util.zze.zza(r5)     // Catch: java.lang.Exception -> L5e
            return
        L5e:
            r4.zzw(r7, r3)
            return
    }

    private final void zzv(android.content.Context r8, java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
            r7 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = r7.zzp(r8)
            if (r1 != 0) goto La
            goto L8d
        La:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "_aeid"
            long r3 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L19 java.lang.NullPointerException -> L1b
            r1.putLong(r2, r3)     // Catch: java.lang.NumberFormatException -> L19 java.lang.NullPointerException -> L1b
            goto L29
        L19:
            r2 = move-exception
            goto L1c
        L1b:
            r2 = move-exception
        L1c:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r3 = "Invalid event ID: "
            java.lang.String r10 = r3.concat(r10)
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r10, r2)
        L29:
            java.lang.String r10 = "_ac"
            boolean r10 = r10.equals(r9)
            r2 = 1
            if (r10 == 0) goto L37
            java.lang.String r10 = "_r"
            r1.putInt(r10, r2)
        L37:
            if (r11 == 0) goto L3c
            r1.putAll(r11)
        L3c:
            java.util.concurrent.atomic.AtomicReference r10 = r7.zzf
            java.lang.String r11 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r10 = r7.zzx(r8, r11, r10, r2)
            if (r10 == 0) goto L8d
            java.util.concurrent.ConcurrentMap r10 = r7.zzh
            java.lang.String r3 = "logEventInternal"
            java.lang.Object r10 = r10.get(r3)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r4 = 2
            r5 = 0
            r6 = 3
            if (r10 == 0) goto L56
            goto L76
        L56:
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Exception -> L72
            java.lang.Class r8 = r8.loadClass(r11)     // Catch: java.lang.Exception -> L72
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L72
            r10[r5] = r0     // Catch: java.lang.Exception -> L72
            r10[r2] = r0     // Catch: java.lang.Exception -> L72
            java.lang.Class<android.os.Bundle> r11 = android.os.Bundle.class
            r10[r4] = r11     // Catch: java.lang.Exception -> L72
            java.lang.reflect.Method r10 = r8.getDeclaredMethod(r3, r10)     // Catch: java.lang.Exception -> L72
            java.util.concurrent.ConcurrentMap r8 = r7.zzh     // Catch: java.lang.Exception -> L72
            r8.put(r3, r10)     // Catch: java.lang.Exception -> L72
            goto L76
        L72:
            r7.zzw(r3, r2)
            r10 = 0
        L76:
            java.util.concurrent.atomic.AtomicReference r8 = r7.zzf     // Catch: java.lang.Exception -> L8a
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Exception -> L8a
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = "am"
            r11[r5] = r0     // Catch: java.lang.Exception -> L8a
            r11[r2] = r9     // Catch: java.lang.Exception -> L8a
            r11[r4] = r1     // Catch: java.lang.Exception -> L8a
            r10.invoke(r8, r11)     // Catch: java.lang.Exception -> L8a
            return
        L8a:
            r7.zzw(r3, r2)
        L8d:
            return
    }

    private final void zzw(java.lang.String r3, boolean r4) {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zza
            boolean r0 = r0.get()
            if (r0 != 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invoke Firebase method "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " error."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            if (r4 == 0) goto L2e
            java.lang.String r3 = "The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date"
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.zza
            r4 = 1
            r3.set(r4)
        L2e:
            return
    }

    private final boolean zzx(android.content.Context r6, java.lang.String r7, java.util.concurrent.atomic.AtomicReference r8, boolean r9) {
            r5 = this;
            java.lang.String r0 = "getInstance"
            java.lang.Object r1 = r8.get()
            r2 = 1
            if (r1 != 0) goto L2d
            r1 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch: java.lang.Exception -> L29
            java.lang.Class r7 = r3.loadClass(r7)     // Catch: java.lang.Exception -> L29
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L29
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r1] = r4     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r0, r3)     // Catch: java.lang.Exception -> L29
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L29
            r3[r1] = r6     // Catch: java.lang.Exception -> L29
            r6 = 0
            java.lang.Object r7 = r7.invoke(r6, r3)     // Catch: java.lang.Exception -> L29
            com.google.android.gms.internal.ads.zzbyw.zza(r8, r6, r7)     // Catch: java.lang.Exception -> L29
            goto L2d
        L29:
            r5.zzw(r0, r9)
            return r1
        L2d:
            return r2
    }

    public final java.lang.String zza(android.content.Context r2) {
            r1 = this;
            boolean r0 = r1.zzp(r2)
            if (r0 != 0) goto L7
            goto L14
        L7:
            java.lang.String r0 = "generateEventId"
            java.lang.Object r2 = r1.zzs(r0, r2)
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.toString()
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final java.lang.String zzb(android.content.Context r13) {
            r12 = this;
            boolean r0 = r12.zzp(r13)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzan
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L27
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r13 = r12.zzs(r0, r13)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L27:
            java.util.concurrent.atomic.AtomicReference r0 = r12.zzb
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L8b
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            if (r0 == 0) goto L54
            com.google.android.gms.internal.ads.zzfuj r0 = com.google.android.gms.internal.ads.zzfum.zza()
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzao
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r5.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.zzbyy r5 = new com.google.android.gms.internal.ads.zzbyy
            r5.<init>(r12)
            r6 = 2
            java.util.concurrent.ExecutorService r0 = r0.zzc(r4, r5, r6)
            goto L86
        L54:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbcm r4 = com.google.android.gms.internal.ads.zzbcv.zzao
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r5 = r5.zza(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            com.google.android.gms.internal.ads.zzbct r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r6.zza(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r6 = r4.intValue()
            r7 = 1
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbyy r11 = new com.google.android.gms.internal.ads.zzbyy
            r11.<init>(r12)
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
        L86:
            java.util.concurrent.atomic.AtomicReference r4 = r12.zzb
            com.google.android.gms.internal.ads.zzbyw.zza(r4, r1, r0)
        L8b:
            java.util.concurrent.atomic.AtomicReference r0 = r12.zzb
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            com.google.android.gms.internal.ads.zzbyx r4 = new com.google.android.gms.internal.ads.zzbyx
            r4.<init>(r12, r13)
            java.util.concurrent.Future r13 = r0.submit(r4)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> La5 java.util.concurrent.TimeoutException -> La6
            java.lang.Object r13 = r13.get(r2, r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.TimeoutException -> La6
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> La5 java.util.concurrent.TimeoutException -> La6
            return r13
        La5:
            return r1
        La6:
            java.lang.String r13 = "TIME_OUT"
            return r13
    }

    public final java.lang.String zzc(android.content.Context r7) {
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.zzp(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto Lb
            goto L48
        Lb:
            java.util.concurrent.atomic.AtomicReference r1 = r6.zzf
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.zzx(r7, r4, r1, r3)
            if (r1 == 0) goto L48
            r1 = 0
            java.lang.reflect.Method r3 = r6.zzt(r7, r0)     // Catch: java.lang.Exception -> L45
            java.util.concurrent.atomic.AtomicReference r4 = r6.zzf     // Catch: java.lang.Exception -> L45
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Exception -> L45
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L45
            if (r3 != 0) goto L40
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.zzt(r7, r3)     // Catch: java.lang.Exception -> L45
            java.util.concurrent.atomic.AtomicReference r3 = r6.zzf     // Catch: java.lang.Exception -> L45
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L45
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L45
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch: java.lang.Exception -> L45
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L45
        L40:
            if (r3 != 0) goto L43
            goto L44
        L43:
            r2 = r3
        L44:
            return r2
        L45:
            r6.zzw(r0, r1)
        L48:
            return r2
    }

    public final java.lang.String zzd(android.content.Context r3) {
            r2 = this;
            boolean r0 = r2.zzp(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.Object r0 = r2.zzc
            monitor-enter(r0)
            java.lang.String r1 = r2.zzd     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r1
        L11:
            java.lang.String r1 = "getGmpAppId"
            java.lang.Object r3 = r2.zzs(r1, r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1d
            r2.zzd = r3     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return r3
        L1d:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    final /* synthetic */ java.lang.String zze(android.content.Context r2) throws java.lang.Exception {
            r1 = this;
            java.lang.String r0 = "getAppInstanceId"
            java.lang.Object r2 = r1.zzs(r0, r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final void zzf(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.zzp(r2)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "beginAdUnitExposure"
            r1.zzu(r2, r3, r0)
            return
    }

    public final void zzg(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.zzp(r2)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "endAdUnitExposure"
            r1.zzu(r2, r3, r0)
            return
    }

    public final void zzh(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "_aa"
            r1 = 0
            r2.zzv(r3, r0, r4, r1)
            return
    }

    public final void zzi(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "_aq"
            r1 = 0
            r2.zzv(r3, r0, r4, r1)
            return
    }

    public final void zzj(android.content.Context r2, java.lang.String r3, java.util.Map r4) {
            r1 = this;
            android.os.Bundle r4 = zzq(r4)
            java.lang.String r0 = "_ac"
            r1.zzv(r2, r0, r3, r4)
            return
    }

    public final void zzk(android.content.Context r2, java.lang.String r3, java.util.Map r4) {
            r1 = this;
            android.os.Bundle r4 = zzq(r4)
            java.lang.String r0 = "_ai"
            r1.zzv(r2, r0, r3, r4)
            return
    }

    public final void zzl(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r2 = this;
            boolean r0 = r2.zzp(r3)
            if (r0 != 0) goto L7
            return
        L7:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_ai"
            r0.putString(r1, r5)
            java.lang.String r5 = "reward_type"
            r0.putString(r5, r6)
            java.lang.String r5 = "reward_value"
            r0.putInt(r5, r7)
            java.lang.String r5 = "_ar"
            r2.zzv(r3, r5, r4, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Log a Firebase reward video event, reward type: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ", reward value: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.ads.internal.util.zze.zza(r3)
            return
    }

    public final void zzm(android.content.Context r2, com.google.android.gms.ads.internal.client.zzm r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzau
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L27
            boolean r3 = r1.zzp(r2)
            if (r3 == 0) goto L27
            boolean r2 = zzr(r2)
            if (r2 != 0) goto L1f
            goto L27
        L1f:
            java.lang.Object r2 = r1.zzi
            monitor-enter(r2)
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            return
        L24:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r3
        L27:
            return
    }

    public final void zzn(android.content.Context r2, com.google.android.gms.ads.internal.client.zzfw r3) {
            r1 = this;
            com.google.android.gms.internal.ads.zzbza r0 = com.google.android.gms.internal.ads.zzbza.zzd(r2)
            com.google.android.gms.internal.ads.zzbyp r0 = r0.zzb()
            r0.zzc(r3)
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzau
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r3 = r0.zza(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L32
            boolean r3 = r1.zzp(r2)
            if (r3 == 0) goto L32
            boolean r2 = zzr(r2)
            if (r2 != 0) goto L2a
            goto L32
        L2a:
            java.lang.Object r2 = r1.zzi
            monitor-enter(r2)
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r3
        L32:
            return
    }

    @java.lang.Deprecated
    public final void zzo(android.content.Context r10, java.lang.String r11) {
            r9 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r1 = r9.zzp(r10)
            if (r1 != 0) goto L9
            goto L64
        L9:
            boolean r1 = r10 instanceof android.app.Activity
            if (r1 == 0) goto L64
            java.util.concurrent.atomic.AtomicReference r1 = r9.zzg
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            r3 = 0
            boolean r1 = r9.zzx(r10, r2, r1, r3)
            if (r1 == 0) goto L64
            java.util.concurrent.ConcurrentMap r1 = r9.zzh
            java.lang.String r4 = "setCurrentScreen"
            java.lang.Object r1 = r1.get(r4)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r5 = 2
            r6 = 1
            r7 = 3
            if (r1 == 0) goto L28
            goto L48
        L28:
            java.lang.ClassLoader r1 = r10.getClassLoader()     // Catch: java.lang.Exception -> L44
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.Exception -> L44
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L44
            java.lang.Class<android.app.Activity> r8 = android.app.Activity.class
            r2[r3] = r8     // Catch: java.lang.Exception -> L44
            r2[r6] = r0     // Catch: java.lang.Exception -> L44
            r2[r5] = r0     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r2)     // Catch: java.lang.Exception -> L44
            java.util.concurrent.ConcurrentMap r0 = r9.zzh     // Catch: java.lang.Exception -> L44
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L44
            goto L48
        L44:
            r9.zzw(r4, r3)
            r1 = 0
        L48:
            r0 = r10
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L61
            java.util.concurrent.atomic.AtomicReference r2 = r9.zzg     // Catch: java.lang.Exception -> L61
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Exception -> L61
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L61
            r7[r3] = r0     // Catch: java.lang.Exception -> L61
            r7[r6] = r11     // Catch: java.lang.Exception -> L61
            java.lang.String r10 = r10.getPackageName()     // Catch: java.lang.Exception -> L61
            r7[r5] = r10     // Catch: java.lang.Exception -> L61
            r1.invoke(r2, r7)     // Catch: java.lang.Exception -> L61
            return
        L61:
            r9.zzw(r4, r3)
        L64:
            return
    }

    public final boolean zzp(android.content.Context r5) {
            r4 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzah
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zza
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzas
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zze
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.ads.internal.util.client.zzf.zzt(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            boolean r5 = com.google.android.gms.ads.internal.util.client.zzf.zzu(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zze
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zze
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.zze
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
    }
}
