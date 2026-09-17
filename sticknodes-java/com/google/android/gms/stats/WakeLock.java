package com.google.android.gms.stats;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes2.dex */
public class WakeLock {
    private static final long zzb = 0;
    private static volatile java.util.concurrent.ScheduledExecutorService zzc;
    private static final java.lang.Object zzd = null;
    private static volatile com.google.android.gms.stats.zzd zze;
    com.google.android.gms.internal.stats.zzb zza;
    private final java.lang.Object zzf;
    private final android.os.PowerManager.WakeLock zzg;
    private int zzh;
    private java.util.concurrent.Future<?> zzi;
    private long zzj;
    private final java.util.Set<com.google.android.gms.stats.zze> zzk;
    private boolean zzl;
    private int zzm;
    private com.google.android.gms.common.util.Clock zzn;
    private android.os.WorkSource zzo;
    private final java.lang.String zzp;
    private final java.lang.String zzq;
    private final android.content.Context zzr;
    private final java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> zzs;
    private java.util.concurrent.atomic.AtomicInteger zzt;
    private final java.util.concurrent.ScheduledExecutorService zzu;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 366(0x16e, double:1.81E-321)
            long r0 = r0.toMillis(r1)
            com.google.android.gms.stats.WakeLock.zzb = r0
            r0 = 0
            com.google.android.gms.stats.WakeLock.zzc = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.stats.WakeLock.zzd = r0
            com.google.android.gms.stats.zzb r0 = new com.google.android.gms.stats.zzb
            r0.<init>()
            com.google.android.gms.stats.WakeLock.zze = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public WakeLock(android.content.Context r7, int r8, java.lang.String r9) {
            r6 = this;
            java.lang.String r0 = r7.getPackageName()
            r6.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.zzf = r1
            r1 = 0
            r6.zzh = r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r6.zzk = r2
            r2 = 1
            r6.zzl = r2
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.common.util.DefaultClock.getInstance()
            r6.zzn = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r6.zzs = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r1)
            r6.zzt = r3
            java.lang.String r3 = "WakeLock: context must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7, r3)
            java.lang.String r3 = "WakeLock: wakeLockName must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9, r3)
            android.content.Context r3 = r7.getApplicationContext()
            r6.zzr = r3
            r6.zzq = r9
            r3 = 0
            r6.zza = r3
            java.lang.String r3 = "com.google.android.gms"
            java.lang.String r4 = r7.getPackageName()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L69
            java.lang.String r3 = java.lang.String.valueOf(r9)
            java.lang.String r4 = "*gcore*:"
            int r5 = r3.length()
            if (r5 == 0) goto L61
            java.lang.String r3 = r4.concat(r3)
            goto L66
        L61:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L66:
            r6.zzp = r3
            goto L6b
        L69:
            r6.zzp = r9
        L6b:
            java.lang.String r3 = "power"
            java.lang.Object r3 = r7.getSystemService(r3)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            if (r3 == 0) goto Lb6
            android.os.PowerManager$WakeLock r8 = r3.newWakeLock(r8, r9)
            r6.zzg = r8
            boolean r9 = com.google.android.gms.common.util.WorkSourceUtil.hasWorkSourcePermission(r7)
            if (r9 == 0) goto L96
            boolean r9 = com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(r0)
            if (r9 == 0) goto L8b
            java.lang.String r0 = r7.getPackageName()
        L8b:
            android.os.WorkSource r7 = com.google.android.gms.common.util.WorkSourceUtil.fromPackage(r7, r0)
            r6.zzo = r7
            if (r7 == 0) goto L96
            zze(r8, r7)
        L96:
            java.util.concurrent.ScheduledExecutorService r7 = com.google.android.gms.stats.WakeLock.zzc
            if (r7 != 0) goto Lb3
            java.lang.Object r8 = com.google.android.gms.stats.WakeLock.zzd
            monitor-enter(r8)
            java.util.concurrent.ScheduledExecutorService r7 = com.google.android.gms.stats.WakeLock.zzc     // Catch: java.lang.Throwable -> Lb0
            if (r7 != 0) goto Lae
            com.google.android.gms.internal.stats.zzh.zza()     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.newScheduledThreadPool(r2)     // Catch: java.lang.Throwable -> Lb0
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(r7)     // Catch: java.lang.Throwable -> Lb0
            com.google.android.gms.stats.WakeLock.zzc = r7     // Catch: java.lang.Throwable -> Lb0
        Lae:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb0
            goto Lb3
        Lb0:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb0
            throw r7
        Lb3:
            r6.zzu = r7
            return
        Lb6:
            com.google.android.gms.internal.stats.zzi r7 = new com.google.android.gms.internal.stats.zzi
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 29
            r8.<init>(r9)
            java.lang.String r0 = "expected a non-null reference"
            r8.append(r0, r1, r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static /* synthetic */ void zza(com.google.android.gms.stats.WakeLock r4) {
            java.lang.Object r0 = r4.zzf
            monitor-enter(r0)
            boolean r1 = r4.isHeld()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        Lb:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r4.zzp     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L30
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L30
            r4.zzc()     // Catch: java.lang.Throwable -> L30
            boolean r1 = r4.isHeld()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L27:
            r1 = 1
            r4.zzh = r1     // Catch: java.lang.Throwable -> L30
            r1 = 0
            r4.zzd(r1)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r4
    }

    private final java.lang.String zzb(java.lang.String r2) {
            r1 = this;
            boolean r2 = r1.zzl
            r0 = 0
            if (r2 == 0) goto L8
            android.text.TextUtils.isEmpty(r0)
        L8:
            return r0
    }

    private final void zzc() {
            r2 = this;
            java.util.Set<com.google.android.gms.stats.zze> r0 = r2.zzk
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set<com.google.android.gms.stats.zze> r1 = r2.zzk
            r0.<init>(r1)
            java.util.Set<com.google.android.gms.stats.zze> r1 = r2.zzk
            r1.clear()
            int r1 = r0.size()
            if (r1 > 0) goto L1c
            return
        L1c:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.stats.zze r0 = (com.google.android.gms.stats.zze) r0
            r0 = 0
            throw r0
    }

    private final void zzd(int r6) {
            r5 = this;
            java.lang.Object r6 = r5.zzf
            monitor-enter(r6)
            boolean r0 = r5.isHeld()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto Lb
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La4
            return
        Lb:
            boolean r0 = r5.zzl     // Catch: java.lang.Throwable -> La4
            r1 = 0
            if (r0 == 0) goto L1b
            int r0 = r5.zzh     // Catch: java.lang.Throwable -> La4
            int r0 = r0 + (-1)
            r5.zzh = r0     // Catch: java.lang.Throwable -> La4
            if (r0 > 0) goto L19
            goto L1d
        L19:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La4
            return
        L1b:
            r5.zzh = r1     // Catch: java.lang.Throwable -> La4
        L1d:
            r5.zzc()     // Catch: java.lang.Throwable -> La4
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r0 = r5.zzs     // Catch: java.lang.Throwable -> La4
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La4
        L2a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> La4
            com.google.android.gms.stats.zzc r2 = (com.google.android.gms.stats.zzc) r2     // Catch: java.lang.Throwable -> La4
            r2.zza = r1     // Catch: java.lang.Throwable -> La4
            goto L2a
        L39:
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r0 = r5.zzs     // Catch: java.lang.Throwable -> La4
            r0.clear()     // Catch: java.lang.Throwable -> La4
            java.util.concurrent.Future<?> r0 = r5.zzi     // Catch: java.lang.Throwable -> La4
            r2 = 0
            if (r0 == 0) goto L4c
            r0.cancel(r1)     // Catch: java.lang.Throwable -> La4
            r5.zzi = r2     // Catch: java.lang.Throwable -> La4
            r3 = 0
            r5.zzj = r3     // Catch: java.lang.Throwable -> La4
        L4c:
            r5.zzm = r1     // Catch: java.lang.Throwable -> La4
            android.os.PowerManager$WakeLock r0 = r5.zzg     // Catch: java.lang.Throwable -> La4
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L91
            android.os.PowerManager$WakeLock r0 = r5.zzg     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            r0.release()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L64
            com.google.android.gms.internal.stats.zzb r0 = r5.zza     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto La2
            r5.zza = r2     // Catch: java.lang.Throwable -> La4
            goto La2
        L62:
            r0 = move-exception
            goto L8a
        L64:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L89
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.zzp     // Catch: java.lang.Throwable -> L62
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L62
            android.util.Log.e(r1, r3, r0)     // Catch: java.lang.Throwable -> L62
            com.google.android.gms.internal.stats.zzb r0 = r5.zza     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto La2
            r5.zza = r2     // Catch: java.lang.Throwable -> La4
            goto La2
        L89:
            throw r0     // Catch: java.lang.Throwable -> L62
        L8a:
            com.google.android.gms.internal.stats.zzb r1 = r5.zza     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L90
            r5.zza = r2     // Catch: java.lang.Throwable -> La4
        L90:
            throw r0     // Catch: java.lang.Throwable -> La4
        L91:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.zzp     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> La4
            android.util.Log.e(r0, r1)     // Catch: java.lang.Throwable -> La4
        La2:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La4
            return
        La4:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La4
            throw r0
    }

    private static void zze(android.os.PowerManager.WakeLock r0, android.os.WorkSource r1) {
            r0.setWorkSource(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L4 java.lang.IllegalArgumentException -> L6
            return
        L4:
            r0 = move-exception
            goto L7
        L6:
            r0 = move-exception
        L7:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "WakeLock"
            android.util.Log.wtf(r1, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void acquire(long r10) {
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r9.zzt
            r0.incrementAndGet()
            long r0 = com.google.android.gms.stats.WakeLock.zzb
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = java.lang.Math.min(r2, r0)
            r4 = 1
            long r0 = java.lang.Math.max(r0, r4)
            r4 = 0
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 <= 0) goto L20
            long r0 = java.lang.Math.min(r10, r0)
        L20:
            java.lang.Object r10 = r9.zzf
            monitor-enter(r10)
            boolean r11 = r9.isHeld()     // Catch: java.lang.Throwable -> L92
            r4 = 0
            r5 = 0
            if (r11 != 0) goto L3b
            com.google.android.gms.internal.stats.zzb r11 = com.google.android.gms.internal.stats.zzb.zza(r4, r5)     // Catch: java.lang.Throwable -> L92
            r9.zza = r11     // Catch: java.lang.Throwable -> L92
            android.os.PowerManager$WakeLock r11 = r9.zzg     // Catch: java.lang.Throwable -> L92
            r11.acquire()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.common.util.Clock r11 = r9.zzn     // Catch: java.lang.Throwable -> L92
            r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L92
        L3b:
            int r11 = r9.zzh     // Catch: java.lang.Throwable -> L92
            int r11 = r11 + 1
            r9.zzh = r11     // Catch: java.lang.Throwable -> L92
            int r11 = r9.zzm     // Catch: java.lang.Throwable -> L92
            int r11 = r11 + 1
            r9.zzm = r11     // Catch: java.lang.Throwable -> L92
            r9.zzb(r5)     // Catch: java.lang.Throwable -> L92
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r11 = r9.zzs     // Catch: java.lang.Throwable -> L92
            java.lang.Object r11 = r11.get(r5)     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.stats.zzc r11 = (com.google.android.gms.stats.zzc) r11     // Catch: java.lang.Throwable -> L92
            if (r11 != 0) goto L5e
            com.google.android.gms.stats.zzc r11 = new com.google.android.gms.stats.zzc     // Catch: java.lang.Throwable -> L92
            r11.<init>(r5)     // Catch: java.lang.Throwable -> L92
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r6 = r9.zzs     // Catch: java.lang.Throwable -> L92
            r6.put(r5, r11)     // Catch: java.lang.Throwable -> L92
        L5e:
            int r5 = r11.zza     // Catch: java.lang.Throwable -> L92
            int r5 = r5 + 1
            r11.zza = r5     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.common.util.Clock r11 = r9.zzn     // Catch: java.lang.Throwable -> L92
            long r5 = r11.elapsedRealtime()     // Catch: java.lang.Throwable -> L92
            long r7 = r2 - r5
            int r11 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r11 <= 0) goto L72
            long r2 = r5 + r0
        L72:
            long r5 = r9.zzj     // Catch: java.lang.Throwable -> L92
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 <= 0) goto L90
            r9.zzj = r2     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.Future<?> r11 = r9.zzi     // Catch: java.lang.Throwable -> L92
            if (r11 == 0) goto L81
            r11.cancel(r4)     // Catch: java.lang.Throwable -> L92
        L81:
            java.util.concurrent.ScheduledExecutorService r11 = r9.zzu     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.stats.zza r2 = new com.google.android.gms.stats.zza     // Catch: java.lang.Throwable -> L92
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L92
            java.util.concurrent.ScheduledFuture r11 = r11.schedule(r2, r0, r3)     // Catch: java.lang.Throwable -> L92
            r9.zzi = r11     // Catch: java.lang.Throwable -> L92
        L90:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            return
        L92:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            throw r11
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isHeld() {
            r2 = this;
            java.lang.Object r0 = r2.zzf
            monitor-enter(r0)
            int r1 = r2.zzh     // Catch: java.lang.Throwable -> Lc
            if (r1 <= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void release() {
            r4 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r4.zzt
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L19
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r4.zzp
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L19:
            java.lang.Object r0 = r4.zzf
            monitor-enter(r0)
            r1 = 0
            r4.zzb(r1)     // Catch: java.lang.Throwable -> L57
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r2 = r4.zzs     // Catch: java.lang.Throwable -> L57
            boolean r2 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L40
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r2 = r4.zzs     // Catch: java.lang.Throwable -> L57
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L57
            com.google.android.gms.stats.zzc r2 = (com.google.android.gms.stats.zzc) r2     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L51
            int r3 = r2.zza     // Catch: java.lang.Throwable -> L57
            int r3 = r3 + (-1)
            r2.zza = r3     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L51
            java.util.Map<java.lang.String, com.google.android.gms.stats.zzc> r2 = r4.zzs     // Catch: java.lang.Throwable -> L57
            r2.remove(r1)     // Catch: java.lang.Throwable -> L57
            goto L51
        L40:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r4.zzp     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = " counter does not exist"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L57
            android.util.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L57
        L51:
            r1 = 0
            r4.zzd(r1)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            return
        L57:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void setReferenceCounted(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.zzf
            monitor-enter(r0)
            r1.zzl = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }
}
