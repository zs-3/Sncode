package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzlf implements com.google.android.gms.internal.drive.zzmg {
    private static final com.google.android.gms.internal.drive.zzlp zzts = null;
    private final com.google.android.gms.internal.drive.zzlp zztr;

    static {
            com.google.android.gms.internal.drive.zzlg r0 = new com.google.android.gms.internal.drive.zzlg
            r0.<init>()
            com.google.android.gms.internal.drive.zzlf.zzts = r0
            return
    }

    public zzlf() {
            r4 = this;
            com.google.android.gms.internal.drive.zzlh r0 = new com.google.android.gms.internal.drive.zzlh
            r1 = 2
            com.google.android.gms.internal.drive.zzlp[] r1 = new com.google.android.gms.internal.drive.zzlp[r1]
            com.google.android.gms.internal.drive.zzkj r2 = com.google.android.gms.internal.drive.zzkj.zzcv()
            r3 = 0
            r1[r3] = r2
            com.google.android.gms.internal.drive.zzlp r2 = zzdv()
            r3 = 1
            r1[r3] = r2
            r0.<init>(r1)
            r4.<init>(r0)
            return
    }

    private zzlf(com.google.android.gms.internal.drive.zzlp r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "messageInfoFactory"
            java.lang.Object r2 = com.google.android.gms.internal.drive.zzkm.zza(r2, r0)
            com.google.android.gms.internal.drive.zzlp r2 = (com.google.android.gms.internal.drive.zzlp) r2
            r1.zztr = r2
            return
    }

    private static boolean zza(com.google.android.gms.internal.drive.zzlo r1) {
            int r1 = r1.zzec()
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsf
            if (r1 != r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    private static com.google.android.gms.internal.drive.zzlp zzdv() {
            java.lang.String r0 = "com.google.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "getInstance"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L19
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L19
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L19
            com.google.android.gms.internal.drive.zzlp r0 = (com.google.android.gms.internal.drive.zzlp) r0     // Catch: java.lang.Exception -> L19
            return r0
        L19:
            com.google.android.gms.internal.drive.zzlp r0 = com.google.android.gms.internal.drive.zzlf.zzts
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzmg
    public final <T> com.google.android.gms.internal.drive.zzmf<T> zze(java.lang.Class<T> r10) {
            r9 = this;
            java.lang.Class<com.google.android.gms.internal.drive.zzkk> r0 = com.google.android.gms.internal.drive.zzkk.class
            com.google.android.gms.internal.drive.zzmh.zzg(r10)
            com.google.android.gms.internal.drive.zzlp r1 = r9.zztr
            com.google.android.gms.internal.drive.zzlo r3 = r1.zzc(r10)
            boolean r1 = r3.zzed()
            if (r1 == 0) goto L39
            boolean r10 = r0.isAssignableFrom(r10)
            if (r10 == 0) goto L28
            com.google.android.gms.internal.drive.zzmx r10 = com.google.android.gms.internal.drive.zzmh.zzeo()
            com.google.android.gms.internal.drive.zzjy r0 = com.google.android.gms.internal.drive.zzka.zzcl()
            com.google.android.gms.internal.drive.zzlq r1 = r3.zzee()
            com.google.android.gms.internal.drive.zzlw r10 = com.google.android.gms.internal.drive.zzlw.zza(r10, r0, r1)
            return r10
        L28:
            com.google.android.gms.internal.drive.zzmx r10 = com.google.android.gms.internal.drive.zzmh.zzem()
            com.google.android.gms.internal.drive.zzjy r0 = com.google.android.gms.internal.drive.zzka.zzcm()
            com.google.android.gms.internal.drive.zzlq r1 = r3.zzee()
            com.google.android.gms.internal.drive.zzlw r10 = com.google.android.gms.internal.drive.zzlw.zza(r10, r0, r1)
            return r10
        L39:
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L76
            boolean r0 = zza(r3)
            if (r0 == 0) goto L5f
            com.google.android.gms.internal.drive.zzly r4 = com.google.android.gms.internal.drive.zzma.zzeh()
            com.google.android.gms.internal.drive.zzla r5 = com.google.android.gms.internal.drive.zzla.zzdu()
            com.google.android.gms.internal.drive.zzmx r6 = com.google.android.gms.internal.drive.zzmh.zzeo()
            com.google.android.gms.internal.drive.zzjy r7 = com.google.android.gms.internal.drive.zzka.zzcl()
            com.google.android.gms.internal.drive.zzll r8 = com.google.android.gms.internal.drive.zzln.zzea()
            r2 = r10
            com.google.android.gms.internal.drive.zzlu r10 = com.google.android.gms.internal.drive.zzlu.zza(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L5f:
            com.google.android.gms.internal.drive.zzly r4 = com.google.android.gms.internal.drive.zzma.zzeh()
            com.google.android.gms.internal.drive.zzla r5 = com.google.android.gms.internal.drive.zzla.zzdu()
            com.google.android.gms.internal.drive.zzmx r6 = com.google.android.gms.internal.drive.zzmh.zzeo()
            r7 = 0
            com.google.android.gms.internal.drive.zzll r8 = com.google.android.gms.internal.drive.zzln.zzea()
            r2 = r10
            com.google.android.gms.internal.drive.zzlu r10 = com.google.android.gms.internal.drive.zzlu.zza(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L76:
            boolean r0 = zza(r3)
            if (r0 == 0) goto L96
            com.google.android.gms.internal.drive.zzly r4 = com.google.android.gms.internal.drive.zzma.zzeg()
            com.google.android.gms.internal.drive.zzla r5 = com.google.android.gms.internal.drive.zzla.zzdt()
            com.google.android.gms.internal.drive.zzmx r6 = com.google.android.gms.internal.drive.zzmh.zzem()
            com.google.android.gms.internal.drive.zzjy r7 = com.google.android.gms.internal.drive.zzka.zzcm()
            com.google.android.gms.internal.drive.zzll r8 = com.google.android.gms.internal.drive.zzln.zzdz()
            r2 = r10
            com.google.android.gms.internal.drive.zzlu r10 = com.google.android.gms.internal.drive.zzlu.zza(r2, r3, r4, r5, r6, r7, r8)
            return r10
        L96:
            com.google.android.gms.internal.drive.zzly r4 = com.google.android.gms.internal.drive.zzma.zzeg()
            com.google.android.gms.internal.drive.zzla r5 = com.google.android.gms.internal.drive.zzla.zzdt()
            com.google.android.gms.internal.drive.zzmx r6 = com.google.android.gms.internal.drive.zzmh.zzen()
            r7 = 0
            com.google.android.gms.internal.drive.zzll r8 = com.google.android.gms.internal.drive.zzln.zzdz()
            r2 = r10
            com.google.android.gms.internal.drive.zzlu r10 = com.google.android.gms.internal.drive.zzlu.zza(r2, r3, r4, r5, r6, r7, r8)
            return r10
    }
}
