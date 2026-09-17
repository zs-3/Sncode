package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzfd extends com.google.android.gms.internal.drive.zzkk<com.google.android.gms.internal.drive.zzfd, com.google.android.gms.internal.drive.zzfd.zza> implements com.google.android.gms.internal.drive.zzls {
    private static volatile com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> zzhk;
    private static final com.google.android.gms.internal.drive.zzfd zzhq = null;
    private int zzhd;
    private long zzhg;
    private byte zzhi;
    private long zzhn;

    public static final class zza extends com.google.android.gms.internal.drive.zzkk.zza<com.google.android.gms.internal.drive.zzfd, com.google.android.gms.internal.drive.zzfd.zza> implements com.google.android.gms.internal.drive.zzls {
        private zza() {
                r1 = this;
                com.google.android.gms.internal.drive.zzfd r0 = com.google.android.gms.internal.drive.zzfd.zzaq()
                r1.<init>(r0)
                return
        }

        /* synthetic */ zza(com.google.android.gms.internal.drive.zzfe r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final com.google.android.gms.internal.drive.zzfd.zza zzi(long r2) {
                r1 = this;
                r1.zzdb()
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                com.google.android.gms.internal.drive.zzfd r0 = (com.google.android.gms.internal.drive.zzfd) r0
                com.google.android.gms.internal.drive.zzfd.zza(r0, r2)
                return r1
        }

        public final com.google.android.gms.internal.drive.zzfd.zza zzj(long r2) {
                r1 = this;
                r1.zzdb()
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                com.google.android.gms.internal.drive.zzfd r0 = (com.google.android.gms.internal.drive.zzfd) r0
                com.google.android.gms.internal.drive.zzfd.zzb(r0, r2)
                return r1
        }
    }

    static {
            com.google.android.gms.internal.drive.zzfd r0 = new com.google.android.gms.internal.drive.zzfd
            r0.<init>()
            com.google.android.gms.internal.drive.zzfd.zzhq = r0
            java.lang.Class<com.google.android.gms.internal.drive.zzfd> r1 = com.google.android.gms.internal.drive.zzfd.class
            com.google.android.gms.internal.drive.zzkk.zza(r1, r0)
            return
    }

    private zzfd() {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.zzhi = r0
            r0 = -1
            r2.zzhn = r0
            r2.zzhg = r0
            return
    }

    private final void zza(long r2) {
            r1 = this;
            int r0 = r1.zzhd
            r0 = r0 | 2
            r1.zzhd = r0
            r1.zzhg = r2
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.internal.drive.zzfd r0, long r1) {
            r0.zzf(r1)
            return
    }

    public static com.google.android.gms.internal.drive.zzfd.zza zzap() {
            com.google.android.gms.internal.drive.zzfd r0 = com.google.android.gms.internal.drive.zzfd.zzhq
            com.google.android.gms.internal.drive.zzkk$zza r0 = r0.zzcw()
            com.google.android.gms.internal.drive.zzfd$zza r0 = (com.google.android.gms.internal.drive.zzfd.zza) r0
            return r0
    }

    static /* synthetic */ com.google.android.gms.internal.drive.zzfd zzaq() {
            com.google.android.gms.internal.drive.zzfd r0 = com.google.android.gms.internal.drive.zzfd.zzhq
            return r0
    }

    static /* synthetic */ void zzb(com.google.android.gms.internal.drive.zzfd r0, long r1) {
            r0.zza(r1)
            return
    }

    private final void zzf(long r2) {
            r1 = this;
            int r0 = r1.zzhd
            r0 = r0 | 1
            r1.zzhd = r0
            r1.zzhn = r2
            return
    }

    @Override // com.google.android.gms.internal.drive.zzkk
    protected final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int[] r5 = com.google.android.gms.internal.drive.zzfe.zzhl
            r0 = 1
            int r3 = r3 - r0
            r3 = r5[r3]
            r5 = 0
            r1 = 0
            switch(r3) {
                case 1: goto L5b;
                case 2: goto L55;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L1f;
                case 6: goto L18;
                case 7: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L11:
            if (r4 != 0) goto L14
            r0 = 0
        L14:
            byte r3 = (byte) r0
            r2.zzhi = r3
            return r1
        L18:
            byte r3 = r2.zzhi
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L1f:
            com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> r3 = com.google.android.gms.internal.drive.zzfd.zzhk
            if (r3 != 0) goto L38
            java.lang.Class<com.google.android.gms.internal.drive.zzfd> r4 = com.google.android.gms.internal.drive.zzfd.class
            monitor-enter(r4)
            com.google.android.gms.internal.drive.zzmb<com.google.android.gms.internal.drive.zzfd> r3 = com.google.android.gms.internal.drive.zzfd.zzhk     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L33
            com.google.android.gms.internal.drive.zzkk$zzb r3 = new com.google.android.gms.internal.drive.zzkk$zzb     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.drive.zzfd r5 = com.google.android.gms.internal.drive.zzfd.zzhq     // Catch: java.lang.Throwable -> L35
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.drive.zzfd.zzhk = r3     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            goto L38
        L35:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            throw r3
        L38:
            return r3
        L39:
            com.google.android.gms.internal.drive.zzfd r3 = com.google.android.gms.internal.drive.zzfd.zzhq
            return r3
        L3c:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "zzhd"
            r3[r5] = r4
            java.lang.String r4 = "zzhn"
            r3[r0] = r4
            r4 = 2
            java.lang.String r5 = "zzhg"
            r3[r4] = r5
            java.lang.String r4 = "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԑ\u0000\u0002Ԑ\u0001"
            com.google.android.gms.internal.drive.zzfd r5 = com.google.android.gms.internal.drive.zzfd.zzhq
            java.lang.Object r3 = com.google.android.gms.internal.drive.zzkk.zza(r5, r4, r3)
            return r3
        L55:
            com.google.android.gms.internal.drive.zzfd$zza r3 = new com.google.android.gms.internal.drive.zzfd$zza
            r3.<init>(r1)
            return r3
        L5b:
            com.google.android.gms.internal.drive.zzfd r3 = new com.google.android.gms.internal.drive.zzfd
            r3.<init>()
            return r3
    }
}
