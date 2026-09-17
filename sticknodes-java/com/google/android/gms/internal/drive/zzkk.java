package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;
import com.google.android.gms.internal.drive.zzkk.zza;

/* loaded from: classes.dex */
public abstract class zzkk<MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType> {
    private static java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> zzrs;
    protected com.google.android.gms.internal.drive.zzmy zzrq;
    private int zzrr;

    public static abstract class zza<MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType> {
        private final MessageType zzrt;
        protected MessageType zzru;
        private boolean zzrv;

        protected zza(MessageType r3) {
                r2 = this;
                r2.<init>()
                r2.zzrt = r3
                int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsa
                r1 = 0
                java.lang.Object r3 = r3.zza(r0, r1, r1)
                com.google.android.gms.internal.drive.zzkk r3 = (com.google.android.gms.internal.drive.zzkk) r3
                r2.zzru = r3
                r3 = 0
                r2.zzrv = r3
                return
        }

        private static void zza(MessageType r1, MessageType r2) {
                com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
                com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r1)
                r0.zzc(r1, r2)
                return
        }

        @Override // com.google.android.gms.internal.drive.zziu
        public /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
                r3 = this;
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r3.zzrt
                int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsb
                r2 = 0
                java.lang.Object r0 = r0.zza(r1, r2, r2)
                com.google.android.gms.internal.drive.zzkk$zza r0 = (com.google.android.gms.internal.drive.zzkk.zza) r0
                com.google.android.gms.internal.drive.zzlq r1 = r3.zzde()
                com.google.android.gms.internal.drive.zzkk r1 = (com.google.android.gms.internal.drive.zzkk) r1
                r0.zza(r1)
                return r0
        }

        @Override // com.google.android.gms.internal.drive.zzls
        public final boolean isInitialized() {
                r2 = this;
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r2.zzru
                r1 = 0
                boolean r0 = com.google.android.gms.internal.drive.zzkk.zza(r0, r1)
                return r0
        }

        @Override // com.google.android.gms.internal.drive.zziu
        protected final /* synthetic */ com.google.android.gms.internal.drive.zziu zza(com.google.android.gms.internal.drive.zzit r1) {
                r0 = this;
                com.google.android.gms.internal.drive.zzkk r1 = (com.google.android.gms.internal.drive.zzkk) r1
                com.google.android.gms.internal.drive.zzkk$zza r1 = r0.zza(r1)
                return r1
        }

        public final BuilderType zza(MessageType r2) {
                r1 = this;
                r1.zzdb()
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                zza(r0, r2)
                return r1
        }

        @Override // com.google.android.gms.internal.drive.zziu
        public final /* synthetic */ com.google.android.gms.internal.drive.zziu zzbn() {
                r1 = this;
                java.lang.Object r0 = r1.clone()
                com.google.android.gms.internal.drive.zzkk$zza r0 = (com.google.android.gms.internal.drive.zzkk.zza) r0
                return r0
        }

        @Override // com.google.android.gms.internal.drive.zzls
        public final /* synthetic */ com.google.android.gms.internal.drive.zzlq zzda() {
                r1 = this;
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzrt
                return r0
        }

        protected final void zzdb() {
                r3 = this;
                boolean r0 = r3.zzrv
                if (r0 == 0) goto L19
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r3.zzru
                int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsa
                r2 = 0
                java.lang.Object r0 = r0.zza(r1, r2, r2)
                com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r1 = r3.zzru
                zza(r0, r1)
                r3.zzru = r0
                r0 = 0
                r3.zzrv = r0
            L19:
                return
        }

        public MessageType zzdc() {
                r1 = this;
                boolean r0 = r1.zzrv
                if (r0 == 0) goto L7
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                return r0
            L7:
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                r0.zzbp()
                r0 = 1
                r1.zzrv = r0
                MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> r0 = r1.zzru
                return r0
        }

        public final MessageType zzdd() {
                r2 = this;
                com.google.android.gms.internal.drive.zzlq r0 = r2.zzde()
                com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
                boolean r1 = r0.isInitialized()
                if (r1 == 0) goto Ld
                return r0
            Ld:
                com.google.android.gms.internal.drive.zzmw r1 = new com.google.android.gms.internal.drive.zzmw
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.android.gms.internal.drive.zzlr
        public /* synthetic */ com.google.android.gms.internal.drive.zzlq zzde() {
                r1 = this;
                com.google.android.gms.internal.drive.zzkk r0 = r1.zzdc()
                return r0
        }

        @Override // com.google.android.gms.internal.drive.zzlr
        public /* synthetic */ com.google.android.gms.internal.drive.zzlq zzdf() {
                r1 = this;
                com.google.android.gms.internal.drive.zzkk r0 = r1.zzdd()
                return r0
        }
    }

    public static class zzb<T extends com.google.android.gms.internal.drive.zzkk<T, ?>> extends com.google.android.gms.internal.drive.zziv<T> {
        private final T zzrt;

        public zzb(T r1) {
                r0 = this;
                r0.<init>()
                r0.zzrt = r1
                return
        }
    }

    public static abstract class zzc<MessageType extends com.google.android.gms.internal.drive.zzkk.zzc<MessageType, BuilderType>, BuilderType> extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType> implements com.google.android.gms.internal.drive.zzls {
        protected com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzrw;

        public zzc() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.internal.drive.zzkb r0 = com.google.android.gms.internal.drive.zzkb.zzcn()
                r1.zzrw = r0
                return
        }

        final com.google.android.gms.internal.drive.zzkb<java.lang.Object> zzdg() {
                r1 = this;
                com.google.android.gms.internal.drive.zzkb<java.lang.Object> r0 = r1.zzrw
                boolean r0 = r0.isImmutable()
                if (r0 == 0) goto L12
                com.google.android.gms.internal.drive.zzkb<java.lang.Object> r0 = r1.zzrw
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.internal.drive.zzkb r0 = (com.google.android.gms.internal.drive.zzkb) r0
                r1.zzrw = r0
            L12:
                com.google.android.gms.internal.drive.zzkb<java.lang.Object> r0 = r1.zzrw
                return r0
        }
    }

    public static class zzd<ContainingType extends com.google.android.gms.internal.drive.zzlq, Type> extends com.google.android.gms.internal.drive.zzjv<ContainingType, Type> {
    }

    public enum zze {
        public static final int zzrx = 1;
        public static final int zzry = 2;
        public static final int zzrz = 3;
        public static final int zzsa = 4;
        public static final int zzsb = 5;
        public static final int zzsc = 6;
        public static final int zzsd = 7;
        private static final /* synthetic */ int[] zzse = null;
        public static final int zzsf = 1;
        public static final int zzsg = 2;
        private static final /* synthetic */ int[] zzsh = null;
        public static final int zzsi = 1;
        public static final int zzsj = 2;
        private static final /* synthetic */ int[] zzsk = null;

        static {
                r0 = 7
                int[] r1 = new int[r0]
                r2 = 0
                r3 = 1
                r1[r2] = r3
                r4 = 2
                r1[r3] = r4
                r5 = 3
                r1[r4] = r5
                r6 = 4
                r1[r5] = r6
                r5 = 5
                r1[r6] = r5
                r6 = 6
                r1[r5] = r6
                r1[r6] = r0
                com.google.android.gms.internal.drive.zzkk.zze.zzse = r1
                int[] r0 = new int[r4]
                r0[r2] = r3
                r0[r3] = r4
                com.google.android.gms.internal.drive.zzkk.zze.zzsh = r0
                int[] r0 = new int[r4]
                r0[r2] = r3
                r0[r3] = r4
                com.google.android.gms.internal.drive.zzkk.zze.zzsk = r0
                return
        }

        public static int[] zzdh() {
                int[] r0 = com.google.android.gms.internal.drive.zzkk.zze.zzse
                java.lang.Object r0 = r0.clone()
                int[] r0 = (int[]) r0
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.google.android.gms.internal.drive.zzkk.zzrs = r0
            return
    }

    public zzkk() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.drive.zzmy r0 = com.google.android.gms.internal.drive.zzmy.zzfa()
            r1.zzrq = r0
            r0 = -1
            r1.zzrr = r0
            return
    }

    private static <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> T zza(T r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.drive.zzjx r10) throws com.google.android.gms.internal.drive.zzkq {
            int r8 = com.google.android.gms.internal.drive.zzkk.zze.zzsa
            r0 = 0
            java.lang.Object r6 = r6.zza(r8, r0, r0)
            com.google.android.gms.internal.drive.zzkk r6 = (com.google.android.gms.internal.drive.zzkk) r6
            com.google.android.gms.internal.drive.zzmd r8 = com.google.android.gms.internal.drive.zzmd.zzej()     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            com.google.android.gms.internal.drive.zzmf r0 = r8.zzq(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            r3 = 0
            com.google.android.gms.internal.drive.zziz r5 = new com.google.android.gms.internal.drive.zziz     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            r5.<init>(r10)     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            r1 = r6
            r2 = r7
            r4 = r9
            r0.zza(r1, r2, r3, r4, r5)     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            r6.zzbp()     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            int r7 = r6.zzne     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            if (r7 != 0) goto L25
            return r6
        L25:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            r7.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
            throw r7     // Catch: java.lang.IndexOutOfBoundsException -> L2b java.io.IOException -> L34
        L2b:
            com.google.android.gms.internal.drive.zzkq r7 = com.google.android.gms.internal.drive.zzkq.zzdi()
            com.google.android.gms.internal.drive.zzkq r6 = r7.zzg(r6)
            throw r6
        L34:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            boolean r8 = r8 instanceof com.google.android.gms.internal.drive.zzkq
            if (r8 == 0) goto L44
            java.lang.Throwable r6 = r7.getCause()
            com.google.android.gms.internal.drive.zzkq r6 = (com.google.android.gms.internal.drive.zzkq) r6
            throw r6
        L44:
            com.google.android.gms.internal.drive.zzkq r8 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r7 = r7.getMessage()
            r8.<init>(r7)
            com.google.android.gms.internal.drive.zzkq r6 = r8.zzg(r6)
            throw r6
    }

    protected static <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> T zza(T r2, byte[] r3, com.google.android.gms.internal.drive.zzjx r4) throws com.google.android.gms.internal.drive.zzkq {
            int r0 = r3.length
            r1 = 0
            com.google.android.gms.internal.drive.zzkk r2 = zza(r2, r3, r1, r0, r4)
            if (r2 == 0) goto L22
            boolean r3 = r2.isInitialized()
            if (r3 == 0) goto Lf
            goto L22
        Lf:
            com.google.android.gms.internal.drive.zzmw r3 = new com.google.android.gms.internal.drive.zzmw
            r3.<init>(r2)
            com.google.android.gms.internal.drive.zzkq r4 = new com.google.android.gms.internal.drive.zzkq
            java.lang.String r3 = r3.getMessage()
            r4.<init>(r3)
            com.google.android.gms.internal.drive.zzkq r2 = r4.zzg(r2)
            throw r2
        L22:
            return r2
    }

    protected static java.lang.Object zza(com.google.android.gms.internal.drive.zzlq r1, java.lang.String r2, java.lang.Object[] r3) {
            com.google.android.gms.internal.drive.zzme r0 = new com.google.android.gms.internal.drive.zzme
            r0.<init>(r1, r2, r3)
            return r0
    }

    static java.lang.Object zza(java.lang.reflect.Method r0, java.lang.Object r1, java.lang.Object... r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5 java.lang.IllegalAccessException -> L20
            return r0
        L5:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 != 0) goto L1d
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 == 0) goto L15
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L15:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected exception thrown by generated accessor method."
            r1.<init>(r2, r0)
            throw r1
        L1d:
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L20:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Couldn't use Java reflection to implement protocol message reflection."
            r1.<init>(r2, r0)
            throw r1
    }

    protected static <T extends com.google.android.gms.internal.drive.zzkk<?, ?>> void zza(java.lang.Class<T> r1, T r2) {
            java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> r0 = com.google.android.gms.internal.drive.zzkk.zzrs
            r0.put(r1, r2)
            return
    }

    protected static final <T extends com.google.android.gms.internal.drive.zzkk<T, ?>> boolean zza(T r3, boolean r4) {
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzrx
            r1 = 0
            java.lang.Object r0 = r3.zza(r0, r1, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r2 = 1
            if (r0 != r2) goto L11
            return r2
        L11:
            if (r0 != 0) goto L15
            r3 = 0
            return r3
        L15:
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r3)
            boolean r0 = r0.zzp(r3)
            if (r4 == 0) goto L2d
            int r4 = com.google.android.gms.internal.drive.zzkk.zze.zzry
            if (r0 == 0) goto L29
            r2 = r3
            goto L2a
        L29:
            r2 = r1
        L2a:
            r3.zza(r4, r2, r1)
        L2d:
            return r0
    }

    static <T extends com.google.android.gms.internal.drive.zzkk<?, ?>> T zzd(java.lang.Class<T> r3) {
            java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> r0 = com.google.android.gms.internal.drive.zzkk.zzrs
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            if (r0 != 0) goto L28
            java.lang.String r0 = r3.getName()     // Catch: java.lang.ClassNotFoundException -> L1f
            r1 = 1
            java.lang.ClassLoader r2 = r3.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L1f
            java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1f
            java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> r0 = com.google.android.gms.internal.drive.zzkk.zzrs
            java.lang.Object r0 = r0.get(r3)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            goto L28
        L1f:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Class initialization cannot fail."
            r0.<init>(r1, r3)
            throw r0
        L28:
            if (r0 != 0) goto L47
            java.lang.Object r0 = com.google.android.gms.internal.drive.zznd.zzh(r3)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            int r1 = com.google.android.gms.internal.drive.zzkk.zze.zzsc
            r2 = 0
            java.lang.Object r0 = r0.zza(r1, r2, r2)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            if (r0 == 0) goto L41
            java.util.Map<java.lang.Object, com.google.android.gms.internal.drive.zzkk<?, ?>> r1 = com.google.android.gms.internal.drive.zzkk.zzrs
            r1.put(r3, r0)
            goto L47
        L41:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L47:
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsc
            r1 = 0
            java.lang.Object r0 = r2.zza(r0, r1, r1)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L19
            r3 = 0
            return r3
        L19:
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r2)
            com.google.android.gms.internal.drive.zzkk r3 = (com.google.android.gms.internal.drive.zzkk) r3
            boolean r3 = r0.equals(r2, r3)
            return r3
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.zzne
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r1)
            int r0 = r0.hashCode(r1)
            r1.zzne = r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzls
    public final boolean isInitialized() {
            r1 = this;
            r0 = 1
            boolean r0 = zza(r1, r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            java.lang.String r0 = com.google.android.gms.internal.drive.zzlt.zza(r1, r0)
            return r0
    }

    protected abstract java.lang.Object zza(int r1, java.lang.Object r2, java.lang.Object r3);

    @Override // com.google.android.gms.internal.drive.zzlq
    public final void zzb(com.google.android.gms.internal.drive.zzjr r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzf(r1)
            com.google.android.gms.internal.drive.zzjt r3 = com.google.android.gms.internal.drive.zzjt.zza(r3)
            r0.zza(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.drive.zzit
    final int zzbm() {
            r1 = this;
            int r0 = r1.zzrr
            return r0
    }

    protected final void zzbp() {
            r1 = this;
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r1)
            r0.zzd(r1)
            return
    }

    protected final <MessageType extends com.google.android.gms.internal.drive.zzkk<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zzkk.zza<MessageType, BuilderType>> BuilderType zzcw() {
            r2 = this;
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsb
            r1 = 0
            java.lang.Object r0 = r2.zza(r0, r1, r1)
            com.google.android.gms.internal.drive.zzkk$zza r0 = (com.google.android.gms.internal.drive.zzkk.zza) r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final int zzcx() {
            r2 = this;
            int r0 = r2.zzrr
            r1 = -1
            if (r0 != r1) goto L13
            com.google.android.gms.internal.drive.zzmd r0 = com.google.android.gms.internal.drive.zzmd.zzej()
            com.google.android.gms.internal.drive.zzmf r0 = r0.zzq(r2)
            int r0 = r0.zzn(r2)
            r2.zzrr = r0
        L13:
            int r0 = r2.zzrr
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zzcy() {
            r2 = this;
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsb
            r1 = 0
            java.lang.Object r0 = r2.zza(r0, r1, r1)
            com.google.android.gms.internal.drive.zzkk$zza r0 = (com.google.android.gms.internal.drive.zzkk.zza) r0
            r0.zza(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzlq
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zzcz() {
            r2 = this;
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsb
            r1 = 0
            java.lang.Object r0 = r2.zza(r0, r1, r1)
            com.google.android.gms.internal.drive.zzkk$zza r0 = (com.google.android.gms.internal.drive.zzkk.zza) r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzls
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlq zzda() {
            r2 = this;
            int r0 = com.google.android.gms.internal.drive.zzkk.zze.zzsc
            r1 = 0
            java.lang.Object r0 = r2.zza(r0, r1, r1)
            com.google.android.gms.internal.drive.zzkk r0 = (com.google.android.gms.internal.drive.zzkk) r0
            return r0
    }

    @Override // com.google.android.gms.internal.drive.zzit
    final void zzo(int r1) {
            r0 = this;
            r0.zzrr = r1
            return
    }
}
