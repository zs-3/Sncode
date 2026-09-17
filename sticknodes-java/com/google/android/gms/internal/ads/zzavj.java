package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzavj implements com.google.android.gms.internal.ads.zzavi {
    protected static volatile com.google.android.gms.internal.ads.zzawo zza;
    protected android.view.MotionEvent zzb;
    protected final java.util.LinkedList zzc;
    protected long zzd;
    protected long zze;
    protected long zzf;
    protected long zzg;
    protected long zzh;
    protected long zzi;
    protected long zzj;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected boolean zzp;
    protected android.util.DisplayMetrics zzq;
    protected com.google.android.gms.internal.ads.zzawg zzr;
    private double zzs;
    private double zzt;
    private boolean zzu;

    static {
            return
    }

    protected zzavj(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.zzc = r0
            r0 = 0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzh = r0
            r2.zzi = r0
            r2.zzj = r0
            r0 = 0
            r2.zzu = r0
            r2.zzp = r0
            com.google.android.gms.internal.ads.zzaub.zzd()     // Catch: java.lang.Throwable -> L45
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L45
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L45
            r2.zzq = r3     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzbcm r3 = com.google.android.gms.internal.ads.zzbcv.zzcJ     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L45
            java.lang.Object r3 = r0.zza(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L45
            com.google.android.gms.internal.ads.zzawg r3 = new com.google.android.gms.internal.ads.zzawg     // Catch: java.lang.Throwable -> L45
            r3.<init>()     // Catch: java.lang.Throwable -> L45
            r2.zzr = r3     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    private final void zzj() {
            r2 = this;
            r0 = 0
            r2.zzh = r0
            r2.zzd = r0
            r2.zze = r0
            r2.zzf = r0
            r2.zzg = r0
            r2.zzi = r0
            r2.zzj = r0
            java.util.LinkedList r0 = r2.zzc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            java.util.LinkedList r0 = r2.zzc
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            r1.recycle()
            goto L1e
        L2e:
            java.util.LinkedList r0 = r2.zzc
            r0.clear()
            goto L3b
        L34:
            android.view.MotionEvent r0 = r2.zzb
            if (r0 == 0) goto L3b
            r0.recycle()
        L3b:
            r0 = 0
            r2.zzb = r0
            return
    }

    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            long r5 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzcC
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r7 = r8.zza(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = 0
            if (r7 == 0) goto L30
            com.google.android.gms.internal.ads.zzawo r9 = com.google.android.gms.internal.ads.zzavj.zza
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zzawo r9 = com.google.android.gms.internal.ads.zzavj.zza
            com.google.android.gms.internal.ads.zzavh r9 = r9.zzd()
            goto L2d
        L2c:
            r9 = r8
        L2d:
            java.lang.String r10 = "be"
            goto L32
        L30:
            r9 = r8
            r10 = r9
        L32:
            r14 = 1
            r15 = 2
            r13 = 3
            if (r2 != r13) goto L4e
            com.google.android.gms.internal.ads.zzasm r8 = r1.zzb(r0, r3, r4)     // Catch: java.lang.Exception -> L49
            r1.zzu = r14     // Catch: java.lang.Exception -> L42
            r0 = 1002(0x3ea, float:1.404E-42)
            r12 = 1002(0x3ea, float:1.404E-42)
            goto L63
        L42:
            r0 = move-exception
            r17 = r0
            r1 = 3
            r18 = 1
            goto L82
        L49:
            r0 = move-exception
            r1 = 3
            r18 = 1
            goto L80
        L4e:
            if (r2 != r15) goto L5a
            com.google.android.gms.internal.ads.zzasm r0 = r1.zzd(r0, r3, r4)     // Catch: java.lang.Exception -> L49
            r3 = 1008(0x3f0, float:1.413E-42)
            r8 = r0
            r12 = 1008(0x3f0, float:1.413E-42)
            goto L63
        L5a:
            com.google.android.gms.internal.ads.zzasm r0 = r1.zzc(r0, r8)     // Catch: java.lang.Exception -> L49
            r3 = 1000(0x3e8, float:1.401E-42)
            r8 = r0
            r12 = 1000(0x3e8, float:1.401E-42)
        L63:
            if (r7 == 0) goto L7d
            if (r9 == 0) goto L7d
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L49
            long r3 = r3 - r5
            r0 = -1
            r17 = 0
            r11 = r9
            r1 = 3
            r13 = r0
            r18 = 1
            r14 = r3
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)     // Catch: java.lang.Exception -> L7b
            goto L7e
        L7b:
            r0 = move-exception
            goto L80
        L7d:
            r1 = 3
        L7e:
            r3 = 2
            goto La7
        L80:
            r17 = r0
        L82:
            if (r7 == 0) goto L7e
            if (r9 == 0) goto L7e
            if (r2 != r1) goto L8e
            r0 = 1003(0x3eb, float:1.406E-42)
            r3 = 2
            r12 = 1003(0x3eb, float:1.406E-42)
            goto L9b
        L8e:
            r3 = 2
            if (r2 != r3) goto L96
            r0 = 1009(0x3f1, float:1.414E-42)
            r12 = 1009(0x3f1, float:1.414E-42)
            goto L9b
        L96:
            r0 = 1001(0x3e9, float:1.403E-42)
            r2 = 1
            r12 = 1001(0x3e9, float:1.403E-42)
        L9b:
            r13 = -1
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r5
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)
        La7:
            long r4 = java.lang.System.currentTimeMillis()
            if (r8 == 0) goto Lf2
            com.google.android.gms.internal.ads.zzhbe r0 = r8.zzbn()     // Catch: java.lang.Exception -> Lf8
            com.google.android.gms.internal.ads.zzath r0 = (com.google.android.gms.internal.ads.zzath) r0     // Catch: java.lang.Exception -> Lf8
            int r0 = r0.zzaY()     // Catch: java.lang.Exception -> Lf8
            if (r0 != 0) goto Lba
            goto Lf2
        Lba:
            com.google.android.gms.internal.ads.zzhbe r0 = r8.zzbn()     // Catch: java.lang.Exception -> Lf8
            com.google.android.gms.internal.ads.zzath r0 = (com.google.android.gms.internal.ads.zzath) r0     // Catch: java.lang.Exception -> Lf8
            int r6 = com.google.android.gms.internal.ads.zzaub.zzc     // Catch: java.lang.Exception -> Lf8
            byte[] r0 = r0.zzaV()     // Catch: java.lang.Exception -> Lf8
            r6 = r21
            java.lang.String r0 = com.google.android.gms.internal.ads.zzaub.zza(r0, r6)     // Catch: java.lang.Exception -> Lf8
            if (r7 == 0) goto L123
            if (r9 == 0) goto L123
            if (r2 != r1) goto Ld7
            r6 = 1006(0x3ee, float:1.41E-42)
            r12 = 1006(0x3ee, float:1.41E-42)
            goto Le2
        Ld7:
            if (r2 != r3) goto Lde
            r6 = 1010(0x3f2, float:1.415E-42)
            r12 = 1010(0x3f2, float:1.415E-42)
            goto Le2
        Lde:
            r6 = 1004(0x3ec, float:1.407E-42)
            r12 = 1004(0x3ec, float:1.407E-42)
        Le2:
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lf8
            long r14 = r13 - r4
            r13 = -1
            r17 = 0
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)     // Catch: java.lang.Exception -> Lf8
            goto L123
        Lf2:
            r0 = 5
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch: java.lang.Exception -> Lf8
            goto L123
        Lf8:
            r0 = move-exception
            r17 = r0
            r0 = 7
            java.lang.String r0 = java.lang.Integer.toString(r0)
            if (r7 == 0) goto L123
            if (r9 == 0) goto L123
            if (r2 != r1) goto L10b
            r1 = 1007(0x3ef, float:1.411E-42)
            r12 = 1007(0x3ef, float:1.411E-42)
            goto L116
        L10b:
            if (r2 != r3) goto L112
            r1 = 1011(0x3f3, float:1.417E-42)
            r12 = 1011(0x3f3, float:1.417E-42)
            goto L116
        L112:
            r1 = 1005(0x3ed, float:1.408E-42)
            r12 = 1005(0x3ed, float:1.408E-42)
        L116:
            r13 = -1
            long r1 = java.lang.System.currentTimeMillis()
            long r14 = r1 - r4
            r11 = r9
            r16 = r10
            r11.zzc(r12, r13, r14, r16, r17)
        L123:
            return r0
    }

    protected abstract long zza(java.lang.StackTraceElement[] r1) throws com.google.android.gms.internal.ads.zzawe;

    protected abstract com.google.android.gms.internal.ads.zzasm zzb(android.content.Context r1, android.view.View r2, android.app.Activity r3);

    protected abstract com.google.android.gms.internal.ads.zzasm zzc(android.content.Context r1, com.google.android.gms.internal.ads.zzasc r2);

    protected abstract com.google.android.gms.internal.ads.zzasm zzd(android.content.Context r1, android.view.View r2, android.app.Activity r3);

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zze(android.content.Context r8, java.lang.String r9, android.view.View r10) {
            r7 = this;
            r3 = 3
            r5 = 0
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            java.lang.String r8 = r0.zzm(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzf(android.content.Context r8, java.lang.String r9, android.view.View r10, android.app.Activity r11) {
            r7 = this;
            r3 = 3
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            java.lang.String r8 = r0.zzm(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzg(android.content.Context r9) {
            r8 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzawr.zzc()
            if (r0 != 0) goto L12
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            java.lang.String r9 = r1.zzm(r2, r3, r4, r5, r6, r7)
            return r9
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "The caller must not be called from the UI thread."
            r9.<init>(r0)
            throw r9
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final java.lang.String zzh(android.content.Context r8, android.view.View r9, android.app.Activity r10) {
            r7 = this;
            r2 = 0
            r3 = 2
            r6 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            java.lang.String r8 = r0.zzm(r1, r2, r3, r4, r5, r6)
            return r8
    }

    protected abstract com.google.android.gms.internal.ads.zzawq zzi(android.view.MotionEvent r1) throws com.google.android.gms.internal.ads.zzawe;

    @Override // com.google.android.gms.internal.ads.zzavi
    public final synchronized void zzk(android.view.MotionEvent r14) {
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.zzu     // Catch: java.lang.Throwable -> L100
            if (r0 == 0) goto Lb
            r13.zzj()     // Catch: java.lang.Throwable -> L100
            r0 = 0
            r13.zzu = r0     // Catch: java.lang.Throwable -> L100
        Lb:
            int r0 = r14.getAction()     // Catch: java.lang.Throwable -> L100
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L18
            if (r0 == r1) goto L18
            goto L4f
        L18:
            float r0 = r14.getRawX()     // Catch: java.lang.Throwable -> L100
            double r3 = (double) r0     // Catch: java.lang.Throwable -> L100
            float r0 = r14.getRawY()     // Catch: java.lang.Throwable -> L100
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L100
            double r7 = r13.zzs     // Catch: java.lang.Throwable -> L100
            double r7 = r3 - r7
            double r9 = r13.zzt     // Catch: java.lang.Throwable -> L100
            double r9 = r5 - r9
            double r11 = r13.zzk     // Catch: java.lang.Throwable -> L100
            double r7 = r7 * r7
            double r9 = r9 * r9
            double r7 = r7 + r9
            double r7 = java.lang.Math.sqrt(r7)     // Catch: java.lang.Throwable -> L100
            double r11 = r11 + r7
            r13.zzk = r11     // Catch: java.lang.Throwable -> L100
            r13.zzs = r3     // Catch: java.lang.Throwable -> L100
            r13.zzt = r5     // Catch: java.lang.Throwable -> L100
            goto L4f
        L3d:
            r3 = 0
            r13.zzk = r3     // Catch: java.lang.Throwable -> L100
            float r0 = r14.getRawX()     // Catch: java.lang.Throwable -> L100
            double r3 = (double) r0     // Catch: java.lang.Throwable -> L100
            r13.zzs = r3     // Catch: java.lang.Throwable -> L100
            float r0 = r14.getRawY()     // Catch: java.lang.Throwable -> L100
            double r3 = (double) r0     // Catch: java.lang.Throwable -> L100
            r13.zzt = r3     // Catch: java.lang.Throwable -> L100
        L4f:
            int r0 = r14.getAction()     // Catch: java.lang.Throwable -> L100
            r3 = 1
            if (r0 == 0) goto Ldf
            if (r0 == r2) goto Lab
            if (r0 == r1) goto L67
            r14 = 3
            if (r0 == r14) goto L60
            goto Lfc
        L60:
            long r0 = r13.zzg     // Catch: java.lang.Throwable -> L100
            long r0 = r0 + r3
            r13.zzg = r0     // Catch: java.lang.Throwable -> L100
            goto Lfc
        L67:
            long r0 = r13.zze     // Catch: java.lang.Throwable -> L100
            int r3 = r14.getHistorySize()     // Catch: java.lang.Throwable -> L100
            int r3 = r3 + r2
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L100
            long r0 = r0 + r3
            r13.zze = r0     // Catch: java.lang.Throwable -> L100
            com.google.android.gms.internal.ads.zzawq r14 = r13.zzi(r14)     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            java.lang.Long r0 = r14.zzd     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            if (r0 == 0) goto L8e
            java.lang.Long r1 = r14.zzg     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            if (r1 == 0) goto L8e
            long r3 = r13.zzi     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r0 = r0.longValue()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            java.lang.Long r5 = r14.zzg     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r5 = r5.longValue()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r0 = r0 + r5
            long r3 = r3 + r0
            r13.zzi = r3     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
        L8e:
            android.util.DisplayMetrics r0 = r13.zzq     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            if (r0 == 0) goto Lfc
            java.lang.Long r0 = r14.zze     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            if (r0 == 0) goto Lfc
            java.lang.Long r1 = r14.zzh     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            if (r1 == 0) goto Lfc
            long r3 = r13.zzj     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r0 = r0.longValue()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            java.lang.Long r14 = r14.zzh     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r5 = r14.longValue()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r0 = r0 + r5
            long r3 = r3 + r0
            r13.zzj = r3     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            goto Lfc
        Lab:
            android.view.MotionEvent r14 = android.view.MotionEvent.obtain(r14)     // Catch: java.lang.Throwable -> L100
            r13.zzb = r14     // Catch: java.lang.Throwable -> L100
            java.util.LinkedList r0 = r13.zzc     // Catch: java.lang.Throwable -> L100
            r0.add(r14)     // Catch: java.lang.Throwable -> L100
            java.util.LinkedList r14 = r13.zzc     // Catch: java.lang.Throwable -> L100
            int r14 = r14.size()     // Catch: java.lang.Throwable -> L100
            r0 = 6
            if (r14 <= r0) goto Lca
            java.util.LinkedList r14 = r13.zzc     // Catch: java.lang.Throwable -> L100
            java.lang.Object r14 = r14.remove()     // Catch: java.lang.Throwable -> L100
            android.view.MotionEvent r14 = (android.view.MotionEvent) r14     // Catch: java.lang.Throwable -> L100
            r14.recycle()     // Catch: java.lang.Throwable -> L100
        Lca:
            long r0 = r13.zzf     // Catch: java.lang.Throwable -> L100
            long r0 = r0 + r3
            r13.zzf = r0     // Catch: java.lang.Throwable -> L100
            java.lang.Throwable r14 = new java.lang.Throwable     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            r14.<init>()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            java.lang.StackTraceElement[] r14 = r14.getStackTrace()     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            long r0 = r13.zza(r14)     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            r13.zzh = r0     // Catch: com.google.android.gms.internal.ads.zzawe -> Lfc java.lang.Throwable -> L100
            goto Lfc
        Ldf:
            float r0 = r14.getX()     // Catch: java.lang.Throwable -> L100
            r13.zzl = r0     // Catch: java.lang.Throwable -> L100
            float r0 = r14.getY()     // Catch: java.lang.Throwable -> L100
            r13.zzm = r0     // Catch: java.lang.Throwable -> L100
            float r0 = r14.getRawX()     // Catch: java.lang.Throwable -> L100
            r13.zzn = r0     // Catch: java.lang.Throwable -> L100
            float r14 = r14.getRawY()     // Catch: java.lang.Throwable -> L100
            r13.zzo = r14     // Catch: java.lang.Throwable -> L100
            long r0 = r13.zzd     // Catch: java.lang.Throwable -> L100
            long r0 = r0 + r3
            r13.zzd = r0     // Catch: java.lang.Throwable -> L100
        Lfc:
            r13.zzp = r2     // Catch: java.lang.Throwable -> L100
            monitor-exit(r13)
            return
        L100:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final synchronized void zzl(int r17, int r18, int r19) {
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            android.view.MotionEvent r0 = r1.zzb     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L22
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcA     // Catch: java.lang.Throwable -> L4e
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r2.zza(r0)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L1d
            r16.zzj()     // Catch: java.lang.Throwable -> L4e
            goto L22
        L1d:
            android.view.MotionEvent r0 = r1.zzb     // Catch: java.lang.Throwable -> L4e
            r0.recycle()     // Catch: java.lang.Throwable -> L4e
        L22:
            android.util.DisplayMetrics r0 = r1.zzq     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L46
            r2 = 0
            r4 = r19
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L4e
            r6 = 1
            r7 = r17
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4e
            float r0 = r0.density     // Catch: java.lang.Throwable -> L4e
            float r7 = r7 * r0
            r8 = r18
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L4e
            float r8 = r8 * r0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L4e
            r1.zzb = r0     // Catch: java.lang.Throwable -> L4e
            goto L49
        L46:
            r0 = 0
            r1.zzb = r0     // Catch: java.lang.Throwable -> L4e
        L49:
            r0 = 0
            r1.zzp = r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r16)
            return
        L4e:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public final void zzn(java.lang.StackTraceElement[] r3) {
            r2 = this;
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzcJ
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzawg r0 = r2.zzr
            if (r0 == 0) goto L1d
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.zzb(r3)
        L1d:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzavi
    public void zzo(android.view.View r1) {
            r0 = this;
            return
    }
}
