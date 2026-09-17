package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public class GoogleApiManager implements android.os.Handler.Callback {
    public static final com.google.android.gms.common.api.Status zaa = null;
    private static final com.google.android.gms.common.api.Status zab = null;
    private static final java.lang.Object zac = null;
    private static com.google.android.gms.common.api.internal.GoogleApiManager zad;
    private long zae;
    private boolean zaf;
    private com.google.android.gms.common.internal.TelemetryData zag;
    private com.google.android.gms.common.internal.TelemetryLoggingClient zah;
    private final android.content.Context zai;
    private final com.google.android.gms.common.GoogleApiAvailability zaj;
    private final com.google.android.gms.common.internal.zal zak;
    private final java.util.concurrent.atomic.AtomicInteger zal;
    private final java.util.concurrent.atomic.AtomicInteger zam;
    private final java.util.Map zan;
    private com.google.android.gms.common.api.internal.zaae zao;
    private final java.util.Set zap;
    private final java.util.Set zaq;
    private final android.os.Handler zar;
    private volatile boolean zas;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 4
            java.lang.String r2 = "Sign-out occurred while this API call was in progress."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zaa = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "The user must be signed in to make this API call."
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.internal.GoogleApiManager.zab = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleApiManager.zac = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private GoogleApiManager(android.content.Context r6, android.os.Looper r7, com.google.android.gms.common.GoogleApiAvailability r8) {
            r5 = this;
            r5.<init>()
            r0 = 10000(0x2710, double:4.9407E-320)
            r5.zae = r0
            r0 = 0
            r5.zaf = r0
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 1
            r1.<init>(r2)
            r5.zal = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r0)
            r5.zam = r1
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r3 = 5
            r4 = 1061158912(0x3f400000, float:0.75)
            r1.<init>(r3, r4, r2)
            r5.zan = r1
            r1 = 0
            r5.zao = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zap = r1
            androidx.collection.ArraySet r1 = new androidx.collection.ArraySet
            r1.<init>()
            r5.zaq = r1
            r5.zas = r2
            r5.zai = r6
            com.google.android.gms.internal.base.zau r1 = new com.google.android.gms.internal.base.zau
            r1.<init>(r7, r5)
            r5.zar = r1
            r5.zaj = r8
            com.google.android.gms.common.internal.zal r7 = new com.google.android.gms.common.internal.zal
            r7.<init>(r8)
            r5.zak = r7
            boolean r6 = com.google.android.gms.common.util.DeviceProperties.isAuto(r6)
            if (r6 == 0) goto L50
            r5.zas = r0
        L50:
            r6 = 6
            android.os.Message r6 = r1.obtainMessage(r6)
            r1.sendMessage(r6)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static void reportSignOut() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicInteger r2 = r1.zam     // Catch: java.lang.Throwable -> L19
            r2.incrementAndGet()     // Catch: java.lang.Throwable -> L19
            android.os.Handler r1 = r1.zar     // Catch: java.lang.Throwable -> L19
            r2 = 10
            android.os.Message r2 = r1.obtainMessage(r2)     // Catch: java.lang.Throwable -> L19
            r1.sendMessageAtFrontOfQueue(r2)     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    static /* bridge */ /* synthetic */ boolean zaC(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            boolean r0 = r0.zas
            return r0
    }

    private static com.google.android.gms.common.api.Status zaF(com.google.android.gms.common.api.internal.ApiKey r4, com.google.android.gms.common.ConnectionResult r5) {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r4 = r4.zaa()
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "API: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " is not available on this device. Connection failed with: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            r0.<init>(r5, r4)
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final com.google.android.gms.common.api.internal.zabq zaG(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            java.util.Map r0 = r2.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = r3.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L18
            com.google.android.gms.common.api.internal.zabq r0 = new com.google.android.gms.common.api.internal.zabq
            r0.<init>(r2, r3)
            java.util.Map r3 = r2.zan
            r3.put(r1, r0)
        L18:
            boolean r3 = r0.zaA()
            if (r3 == 0) goto L23
            java.util.Set r3 = r2.zaq
            r3.add(r1)
        L23:
            r0.zao()
            return r0
    }

    private final com.google.android.gms.common.internal.TelemetryLoggingClient zaH() {
            r1 = this;
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zah
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.zai
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r0)
            r1.zah = r0
        Lc:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zah
            return r0
    }

    private final void zaI() {
            r2 = this;
            com.google.android.gms.common.internal.TelemetryData r0 = r2.zag
            if (r0 == 0) goto L1a
            int r1 = r0.zaa()
            if (r1 > 0) goto L10
            boolean r1 = r2.zaD()
            if (r1 == 0) goto L17
        L10:
            com.google.android.gms.common.internal.TelemetryLoggingClient r1 = r2.zaH()
            r1.log(r0)
        L17:
            r0 = 0
            r2.zag = r0
        L1a:
            return
    }

    private final void zaJ(com.google.android.gms.tasks.TaskCompletionSource r2, int r3, com.google.android.gms.common.api.GoogleApi r4) {
            r1 = this;
            if (r3 == 0) goto L1d
            com.google.android.gms.common.api.internal.ApiKey r4 = r4.getApiKey()
            com.google.android.gms.common.api.internal.zacd r3 = com.google.android.gms.common.api.internal.zacd.zaa(r1, r3, r4)
            if (r3 == 0) goto L1d
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            android.os.Handler r4 = r1.zar
            r4.getClass()
            com.google.android.gms.common.api.internal.zabk r0 = new com.google.android.gms.common.api.internal.zabk
            r0.<init>(r4)
            r2.addOnCompleteListener(r0, r3)
        L1d:
            return
    }

    static /* bridge */ /* synthetic */ long zab(com.google.android.gms.common.api.internal.GoogleApiManager r2) {
            long r0 = r2.zae
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zac(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.content.Context r0 = r0.zai
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Handler zad(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            android.os.Handler r0 = r0.zar
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zae(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.GoogleApiAvailability r0 = r0.zaj
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zaf() {
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zab
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zag(com.google.android.gms.common.api.internal.ApiKey r0, com.google.android.gms.common.ConnectionResult r1) {
            com.google.android.gms.common.api.Status r0 = zaF(r0, r1)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.zaae zah(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.api.internal.zaae r0 = r0.zao
            return r0
    }

    public static com.google.android.gms.common.api.internal.GoogleApiManager zaj() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            java.lang.String r2 = "Must guarantee manager is non-null before using getInstance"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.common.api.internal.GoogleApiManager zak(android.content.Context r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L1e
            android.os.HandlerThread r1 = com.google.android.gms.common.internal.GmsClientSupervisor.getOrStartHandlerThread()     // Catch: java.lang.Throwable -> L22
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = new com.google.android.gms.common.api.internal.GoogleApiManager     // Catch: java.lang.Throwable -> L22
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.GoogleApiAvailability r3 = com.google.android.gms.common.GoogleApiAvailability.getInstance()     // Catch: java.lang.Throwable -> L22
            r2.<init>(r4, r1, r3)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.common.api.internal.GoogleApiManager.zad = r2     // Catch: java.lang.Throwable -> L22
        L1e:
            com.google.android.gms.common.api.internal.GoogleApiManager r4 = com.google.android.gms.common.api.internal.GoogleApiManager.zad     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r4
        L22:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r4
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.zal zal(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            com.google.android.gms.common.internal.zal r0 = r0.zak
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.Object zaq() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Map zar(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Map r0 = r0.zan
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.Set zas(com.google.android.gms.common.api.internal.GoogleApiManager r0) {
            java.util.Set r0 = r0.zap
            return r0
    }

    static /* bridge */ /* synthetic */ void zat(com.google.android.gms.common.api.internal.GoogleApiManager r0, boolean r1) {
            r1 = 1
            r0.zaf = r1
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r10) {
            r9 = this;
            int r0 = r10.what
            r1 = 13
            r2 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r5 = 17
            r6 = 0
            r7 = 0
            r8 = 1
            switch(r0) {
                case 1: goto L2f7;
                case 2: goto L2a7;
                case 3: goto L28a;
                case 4: goto L24d;
                case 5: goto L1c4;
                case 6: goto L195;
                case 7: goto L18c;
                case 8: goto L24d;
                case 9: goto L173;
                case 10: goto L14c;
                case 11: goto L133;
                case 12: goto L11a;
                case 13: goto L24d;
                case 14: goto Le6;
                case 15: goto Lc5;
                case 16: goto La4;
                case 17: goto L9f;
                case 18: goto L2a;
                case 19: goto L26;
                default: goto L11;
            }
        L11:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Unknown message id: "
            r10.append(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.w(r4, r10)
            return r7
        L26:
            r9.zaf = r7
            goto L32f
        L2a:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zace r10 = (com.google.android.gms.common.api.internal.zace) r10
            long r0 = r10.zac
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L50
            com.google.android.gms.common.internal.TelemetryData r0 = new com.google.android.gms.common.internal.TelemetryData
            int r1 = r10.zab
            com.google.android.gms.common.internal.MethodInvocation[] r2 = new com.google.android.gms.common.internal.MethodInvocation[r8]
            com.google.android.gms.common.internal.MethodInvocation r10 = r10.zaa
            r2[r7] = r10
            java.util.List r10 = java.util.Arrays.asList(r2)
            r0.<init>(r1, r10)
            com.google.android.gms.common.internal.TelemetryLoggingClient r10 = r9.zaH()
            r10.log(r0)
            goto L32f
        L50:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            if (r0 == 0) goto L7b
            java.util.List r1 = r0.zab()
            int r0 = r0.zaa()
            int r2 = r10.zab
            if (r0 != r2) goto L73
            if (r1 == 0) goto L6b
            int r0 = r1.size()
            int r1 = r10.zad
            if (r0 < r1) goto L6b
            goto L73
        L6b:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.zac(r1)
            goto L7b
        L73:
            android.os.Handler r0 = r9.zar
            r0.removeMessages(r5)
            r9.zaI()
        L7b:
            com.google.android.gms.common.internal.TelemetryData r0 = r9.zag
            if (r0 != 0) goto L32f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.common.internal.MethodInvocation r1 = r10.zaa
            r0.add(r1)
            com.google.android.gms.common.internal.TelemetryData r1 = new com.google.android.gms.common.internal.TelemetryData
            int r2 = r10.zab
            r1.<init>(r2, r0)
            r9.zag = r1
            android.os.Handler r0 = r9.zar
            android.os.Message r1 = r0.obtainMessage(r5)
            long r2 = r10.zac
            r0.sendMessageDelayed(r1, r2)
            goto L32f
        L9f:
            r9.zaI()
            goto L32f
        La4:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32f
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zam(r0, r10)
            goto L32f
        Lc5:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zabs r10 = (com.google.android.gms.common.api.internal.zabs) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32f
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.internal.ApiKey r1 = com.google.android.gms.common.api.internal.zabs.zab(r10)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            com.google.android.gms.common.api.internal.zabq.zal(r0, r10)
            goto L32f
        Le6:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zaaf r10 = (com.google.android.gms.common.api.internal.zaaf) r10
            com.google.android.gms.common.api.internal.ApiKey r0 = r10.zaa()
            java.util.Map r1 = r9.zan
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L101
            com.google.android.gms.tasks.TaskCompletionSource r10 = r10.zab()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.setResult(r0)
            goto L32f
        L101:
            java.util.Map r1 = r9.zan
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            boolean r0 = com.google.android.gms.common.api.internal.zabq.zay(r0, r7)
            com.google.android.gms.tasks.TaskCompletionSource r10 = r10.zab()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.setResult(r0)
            goto L32f
        L11a:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32f
            java.util.Map r0 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zaB()
            goto L32f
        L133:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32f
            java.util.Map r0 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zaw()
            goto L32f
        L14c:
            java.util.Set r10 = r9.zaq
            java.util.Iterator r10 = r10.iterator()
        L152:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L16c
            java.lang.Object r0 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r0 = (com.google.android.gms.common.api.internal.ApiKey) r0
            java.util.Map r1 = r9.zan
            java.lang.Object r0 = r1.remove(r0)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 == 0) goto L152
            r0.zav()
            goto L152
        L16c:
            java.util.Set r10 = r9.zaq
            r10.clear()
            goto L32f
        L173:
            java.util.Map r0 = r9.zan
            java.lang.Object r1 = r10.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32f
            java.util.Map r0 = r9.zan
            java.lang.Object r10 = r10.obj
            java.lang.Object r10 = r0.get(r10)
            com.google.android.gms.common.api.internal.zabq r10 = (com.google.android.gms.common.api.internal.zabq) r10
            r10.zau()
            goto L32f
        L18c:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.GoogleApi r10 = (com.google.android.gms.common.api.GoogleApi) r10
            r9.zaG(r10)
            goto L32f
        L195:
            android.content.Context r10 = r9.zai
            android.content.Context r10 = r10.getApplicationContext()
            boolean r10 = r10 instanceof android.app.Application
            if (r10 == 0) goto L32f
            android.content.Context r10 = r9.zai
            android.content.Context r10 = r10.getApplicationContext()
            android.app.Application r10 = (android.app.Application) r10
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r10)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            com.google.android.gms.common.api.internal.zabl r0 = new com.google.android.gms.common.api.internal.zabl
            r0.<init>(r9)
            r10.addListener(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r10 = r10.readCurrentStateIfPossible(r8)
            if (r10 != 0) goto L32f
            r9.zae = r2
            goto L32f
        L1c4:
            int r0 = r10.arg1
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.ConnectionResult r10 = (com.google.android.gms.common.ConnectionResult) r10
            java.util.Map r2 = r9.zan
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L1d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e7
            java.lang.Object r3 = r2.next()
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            int r7 = r3.zab()
            if (r7 != r0) goto L1d4
            r6 = r3
        L1e7:
            if (r6 == 0) goto L22d
            int r0 = r10.getErrorCode()
            if (r0 != r1) goto L220
            com.google.android.gms.common.GoogleApiAvailability r0 = r9.zaj
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status
            int r2 = r10.getErrorCode()
            java.lang.String r0 = r0.getErrorString(r2)
            java.lang.String r10 = r10.getErrorMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error resolution was canceled by the user, original error message: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r1.<init>(r5, r10)
            com.google.android.gms.common.api.internal.zabq.zai(r6, r1)
            goto L32f
        L220:
            com.google.android.gms.common.api.internal.ApiKey r0 = com.google.android.gms.common.api.internal.zabq.zag(r6)
            com.google.android.gms.common.api.Status r10 = zaF(r0, r10)
            com.google.android.gms.common.api.internal.zabq.zai(r6, r10)
            goto L32f
        L22d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Could not find API instance "
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            android.util.Log.wtf(r4, r10, r0)
            goto L32f
        L24d:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zach r10 = (com.google.android.gms.common.api.internal.zach) r10
            java.util.Map r0 = r9.zan
            com.google.android.gms.common.api.GoogleApi r1 = r10.zac
            com.google.android.gms.common.api.internal.ApiKey r1 = r1.getApiKey()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            if (r0 != 0) goto L267
            com.google.android.gms.common.api.GoogleApi r0 = r10.zac
            com.google.android.gms.common.api.internal.zabq r0 = r9.zaG(r0)
        L267:
            boolean r1 = r0.zaA()
            if (r1 == 0) goto L283
            java.util.concurrent.atomic.AtomicInteger r1 = r9.zam
            int r1 = r1.get()
            int r2 = r10.zab
            if (r1 == r2) goto L283
            com.google.android.gms.common.api.internal.zai r10 = r10.zaa
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.internal.GoogleApiManager.zaa
            r10.zad(r1)
            r0.zav()
            goto L32f
        L283:
            com.google.android.gms.common.api.internal.zai r10 = r10.zaa
            r0.zap(r10)
            goto L32f
        L28a:
            java.util.Map r10 = r9.zan
            java.util.Collection r10 = r10.values()
            java.util.Iterator r10 = r10.iterator()
        L294:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L32f
            java.lang.Object r0 = r10.next()
            com.google.android.gms.common.api.internal.zabq r0 = (com.google.android.gms.common.api.internal.zabq) r0
            r0.zan()
            r0.zao()
            goto L294
        L2a7:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.api.internal.zal r10 = (com.google.android.gms.common.api.internal.zal) r10
            java.util.Set r0 = r10.zab()
            java.util.Iterator r0 = r0.iterator()
        L2b3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32f
            java.lang.Object r2 = r0.next()
            com.google.android.gms.common.api.internal.ApiKey r2 = (com.google.android.gms.common.api.internal.ApiKey) r2
            java.util.Map r3 = r9.zan
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.common.api.internal.zabq r3 = (com.google.android.gms.common.api.internal.zabq) r3
            if (r3 != 0) goto L2d2
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r1)
            r10.zac(r2, r0, r6)
            goto L32f
        L2d2:
            boolean r4 = r3.zaz()
            if (r4 == 0) goto L2e6
            com.google.android.gms.common.ConnectionResult r4 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()
            java.lang.String r3 = r3.getEndpointPackageName()
            r10.zac(r2, r4, r3)
            goto L2b3
        L2e6:
            com.google.android.gms.common.ConnectionResult r4 = r3.zad()
            if (r4 == 0) goto L2f0
            r10.zac(r2, r4, r6)
            goto L2b3
        L2f0:
            r3.zat(r10)
            r3.zao()
            goto L2b3
        L2f7:
            java.lang.Object r10 = r10.obj
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r8 == r10) goto L302
            goto L304
        L302:
            r2 = 10000(0x2710, double:4.9407E-320)
        L304:
            r9.zae = r2
            android.os.Handler r10 = r9.zar
            r0 = 12
            r10.removeMessages(r0)
            java.util.Map r10 = r9.zan
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L317:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L32f
            java.lang.Object r1 = r10.next()
            com.google.android.gms.common.api.internal.ApiKey r1 = (com.google.android.gms.common.api.internal.ApiKey) r1
            android.os.Handler r2 = r9.zar
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r9.zae
            r2.sendMessageDelayed(r1, r3)
            goto L317
        L32f:
            return r8
    }

    public final void zaA(com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> L19
            if (r1 == r3) goto Le
            r2.zao = r3     // Catch: java.lang.Throwable -> L19
            java.util.Set r1 = r2.zap     // Catch: java.lang.Throwable -> L19
            r1.clear()     // Catch: java.lang.Throwable -> L19
        Le:
            java.util.Set r1 = r2.zap     // Catch: java.lang.Throwable -> L19
            androidx.collection.ArraySet r3 = r3.zaa()     // Catch: java.lang.Throwable -> L19
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }

    final void zaB(com.google.android.gms.common.api.internal.zaae r3) {
            r2 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zac
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.zaae r1 = r2.zao     // Catch: java.lang.Throwable -> L11
            if (r1 != r3) goto Lf
            r3 = 0
            r2.zao = r3     // Catch: java.lang.Throwable -> L11
            java.util.Set r3 = r2.zap     // Catch: java.lang.Throwable -> L11
            r3.clear()     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    final boolean zaD() {
            r4 = this;
            boolean r0 = r4.zaf
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.internal.RootTelemetryConfigManager r0 = com.google.android.gms.common.internal.RootTelemetryConfigManager.getInstance()
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r0.getConfig()
            if (r0 == 0) goto L18
            boolean r0 = r0.getMethodInvocationTelemetryEnabled()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            com.google.android.gms.common.internal.zal r0 = r4.zak
            android.content.Context r2 = r4.zai
            r3 = 203400000(0xc1fa340, float:1.2298041E-31)
            int r0 = r0.zaa(r2, r3)
            r2 = -1
            if (r0 == r2) goto L2a
            if (r0 != 0) goto L29
            goto L2a
        L29:
            return r1
        L2a:
            r0 = 1
            return r0
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    final boolean zaE(com.google.android.gms.common.ConnectionResult r3, int r4) {
            r2 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = r2.zaj
            android.content.Context r1 = r2.zai
            boolean r3 = r0.zah(r1, r3, r4)
            return r3
    }

    public final int zaa() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.zal
            int r0 = r0.getAndIncrement()
            return r0
    }

    final com.google.android.gms.common.api.internal.zabq zai(com.google.android.gms.common.api.internal.ApiKey r2) {
            r1 = this;
            java.util.Map r0 = r1.zan
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.common.api.internal.zabq r2 = (com.google.android.gms.common.api.internal.zabq) r2
            return r2
    }

    public final com.google.android.gms.tasks.Task zam(java.lang.Iterable r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zal r0 = new com.google.android.gms.common.api.internal.zal
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 2
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r1 = r2.zar
            r1.sendMessage(r3)
            com.google.android.gms.tasks.Task r3 = r0.zaa()
            return r3
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.tasks.Task zan(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.zaaf r0 = new com.google.android.gms.common.api.internal.zaaf
            com.google.android.gms.common.api.internal.ApiKey r3 = r3.getApiKey()
            r0.<init>(r3)
            android.os.Handler r3 = r2.zar
            r1 = 14
            android.os.Message r3 = r3.obtainMessage(r1, r0)
            android.os.Handler r1 = r2.zar
            r1.sendMessage(r3)
            com.google.android.gms.tasks.TaskCompletionSource r3 = r0.zab()
            com.google.android.gms.tasks.Task r3 = r3.getTask()
            return r3
    }

    public final com.google.android.gms.tasks.Task zao(com.google.android.gms.common.api.GoogleApi r4, com.google.android.gms.common.api.internal.RegisterListenerMethod r5, com.google.android.gms.common.api.internal.UnregisterListenerMethod r6, java.lang.Runnable r7) {
            r3 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            int r1 = r5.zaa()
            r3.zaJ(r0, r1, r4)
            com.google.android.gms.common.api.internal.zaf r1 = new com.google.android.gms.common.api.internal.zaf
            com.google.android.gms.common.api.internal.zaci r2 = new com.google.android.gms.common.api.internal.zaci
            r2.<init>(r5, r6, r7)
            r1.<init>(r2, r0)
            java.util.concurrent.atomic.AtomicInteger r5 = r3.zam
            com.google.android.gms.common.api.internal.zach r6 = new com.google.android.gms.common.api.internal.zach
            int r5 = r5.get()
            r6.<init>(r1, r5, r4)
            android.os.Handler r4 = r3.zar
            r5 = 8
            android.os.Message r4 = r4.obtainMessage(r5, r6)
            android.os.Handler r5 = r3.zar
            r5.sendMessage(r4)
            com.google.android.gms.tasks.Task r4 = r0.getTask()
            return r4
    }

    public final com.google.android.gms.tasks.Task zap(com.google.android.gms.common.api.GoogleApi r3, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r4, int r5) {
            r2 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r2.zaJ(r0, r5, r3)
            com.google.android.gms.common.api.internal.zah r5 = new com.google.android.gms.common.api.internal.zah
            r5.<init>(r4, r0)
            java.util.concurrent.atomic.AtomicInteger r4 = r2.zam
            com.google.android.gms.common.api.internal.zach r1 = new com.google.android.gms.common.api.internal.zach
            int r4 = r4.get()
            r1.<init>(r5, r4, r3)
            android.os.Handler r3 = r2.zar
            r4 = 13
            android.os.Message r3 = r3.obtainMessage(r4, r1)
            android.os.Handler r4 = r2.zar
            r4.sendMessage(r3)
            com.google.android.gms.tasks.Task r3 = r0.getTask()
            return r3
    }

    public final void zau(com.google.android.gms.common.api.GoogleApi r2, int r3, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl r4) {
            r1 = this;
            com.google.android.gms.common.api.internal.zae r0 = new com.google.android.gms.common.api.internal.zae
            r0.<init>(r3, r4)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r3 = r1.zar
            r3.sendMessage(r2)
            return
    }

    public final void zav(com.google.android.gms.common.api.GoogleApi r2, int r3, com.google.android.gms.common.api.internal.TaskApiCall r4, com.google.android.gms.tasks.TaskCompletionSource r5, com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            int r0 = r4.zaa()
            r1.zaJ(r5, r0, r2)
            com.google.android.gms.common.api.internal.zag r0 = new com.google.android.gms.common.api.internal.zag
            r0.<init>(r3, r4, r5, r6)
            java.util.concurrent.atomic.AtomicInteger r3 = r1.zam
            com.google.android.gms.common.api.internal.zach r4 = new com.google.android.gms.common.api.internal.zach
            int r3 = r3.get()
            r4.<init>(r0, r3, r2)
            android.os.Handler r2 = r1.zar
            r3 = 4
            android.os.Message r2 = r2.obtainMessage(r3, r4)
            android.os.Handler r3 = r1.zar
            r3.sendMessage(r2)
            return
    }

    final void zaw(com.google.android.gms.common.internal.MethodInvocation r8, int r9, long r10, int r12) {
            r7 = this;
            com.google.android.gms.common.api.internal.zace r6 = new com.google.android.gms.common.api.internal.zace
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r5)
            android.os.Handler r8 = r7.zar
            r9 = 18
            android.os.Message r8 = r8.obtainMessage(r9, r6)
            android.os.Handler r9 = r7.zar
            r9.sendMessage(r8)
            return
    }

    public final void zax(com.google.android.gms.common.ConnectionResult r4, int r5) {
            r3 = this;
            boolean r0 = r3.zaE(r4, r5)
            if (r0 != 0) goto L11
            android.os.Handler r0 = r3.zar
            r1 = 5
            r2 = 0
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r0.sendMessage(r4)
        L11:
            return
    }

    public final void zay() {
            r2 = this;
            android.os.Handler r0 = r2.zar
            r1 = 3
            android.os.Message r1 = r0.obtainMessage(r1)
            r0.sendMessage(r1)
            return
    }

    public final void zaz(com.google.android.gms.common.api.GoogleApi r3) {
            r2 = this;
            android.os.Handler r0 = r2.zar
            r1 = 7
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            r0.sendMessage(r3)
            return
    }
}
