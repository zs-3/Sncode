package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public class zzjx {
    private static volatile boolean zzol;
    private static final java.lang.Class<?> zzom = null;
    private static volatile com.google.android.gms.internal.drive.zzjx zzon;
    static final com.google.android.gms.internal.drive.zzjx zzoo = null;
    private final java.util.Map<com.google.android.gms.internal.drive.zzjx.zza, com.google.android.gms.internal.drive.zzkk.zzd<?, ?>> zzop;

    static final class zza {
        private final int number;
        private final java.lang.Object object;

        zza(java.lang.Object r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.object = r1
                r0.number = r2
                return
        }

        public final boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof com.google.android.gms.internal.drive.zzjx.zza
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.android.gms.internal.drive.zzjx$zza r4 = (com.google.android.gms.internal.drive.zzjx.zza) r4
                java.lang.Object r0 = r3.object
                java.lang.Object r2 = r4.object
                if (r0 != r2) goto L16
                int r0 = r3.number
                int r4 = r4.number
                if (r0 != r4) goto L16
                r4 = 1
                return r4
            L16:
                return r1
        }

        public final int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.object
                int r0 = java.lang.System.identityHashCode(r0)
                r1 = 65535(0xffff, float:9.1834E-41)
                int r0 = r0 * r1
                int r1 = r2.number
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            java.lang.Class r0 = zzch()
            com.google.android.gms.internal.drive.zzjx.zzom = r0
            com.google.android.gms.internal.drive.zzjx r0 = new com.google.android.gms.internal.drive.zzjx
            r1 = 1
            r0.<init>(r1)
            com.google.android.gms.internal.drive.zzjx.zzoo = r0
            return
    }

    zzjx() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zzop = r0
            return
    }

    private zzjx(boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.zzop = r1
            return
    }

    static com.google.android.gms.internal.drive.zzjx zzcg() {
            java.lang.Class<com.google.android.gms.internal.drive.zzjx> r0 = com.google.android.gms.internal.drive.zzjx.class
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzki.zza(r0)
            return r0
    }

    private static java.lang.Class<?> zzch() {
            java.lang.String r0 = "com.google.protobuf.Extension"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjx zzci() {
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjw.zzcf()
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjx zzcj() {
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzon
            if (r0 != 0) goto L16
            java.lang.Class<com.google.android.gms.internal.drive.zzjx> r1 = com.google.android.gms.internal.drive.zzjx.class
            monitor-enter(r1)
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjx.zzon     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L11
            com.google.android.gms.internal.drive.zzjx r0 = com.google.android.gms.internal.drive.zzjw.zzcg()     // Catch: java.lang.Throwable -> L13
            com.google.android.gms.internal.drive.zzjx.zzon = r0     // Catch: java.lang.Throwable -> L13
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
        L16:
            return r0
    }

    public final <ContainingType extends com.google.android.gms.internal.drive.zzlq> com.google.android.gms.internal.drive.zzkk.zzd<ContainingType, ?> zza(ContainingType r3, int r4) {
            r2 = this;
            java.util.Map<com.google.android.gms.internal.drive.zzjx$zza, com.google.android.gms.internal.drive.zzkk$zzd<?, ?>> r0 = r2.zzop
            com.google.android.gms.internal.drive.zzjx$zza r1 = new com.google.android.gms.internal.drive.zzjx$zza
            r1.<init>(r3, r4)
            java.lang.Object r3 = r0.get(r1)
            com.google.android.gms.internal.drive.zzkk$zzd r3 = (com.google.android.gms.internal.drive.zzkk.zzd) r3
            return r3
    }
}
