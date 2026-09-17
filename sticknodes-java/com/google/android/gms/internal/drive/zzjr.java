package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public abstract class zzjr extends com.google.android.gms.internal.drive.zzjb {
    private static final java.util.logging.Logger logger = null;
    private static final boolean zzog = false;
    com.google.android.gms.internal.drive.zzjt zzoh;

    static class zza extends com.google.android.gms.internal.drive.zzjr {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] r3, int r4, int r5) {
                r2 = this;
                r4 = 0
                r2.<init>(r4)
                java.lang.String r4 = "buffer"
                java.util.Objects.requireNonNull(r3, r4)
                r4 = r5 | 0
                int r0 = r3.length
                int r1 = r5 + 0
                int r0 = r0 - r1
                r4 = r4 | r0
                r0 = 0
                if (r4 < 0) goto L1c
                r2.buffer = r3
                r2.offset = r0
                r2.position = r0
                r2.limit = r1
                return
            L1c:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r3 = r3.length
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r0] = r3
                r3 = 1
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1[r3] = r0
                r3 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r1[r3] = r5
                java.lang.String r3 = "Array range is invalid. Buffer.length=%d, offset=%d, length=%d"
                java.lang.String r3 = java.lang.String.format(r3, r1)
                r4.<init>(r3)
                throw r4
        }

        private final void write(byte[] r4, int r5, int r6) throws java.io.IOException {
                r3 = this;
                byte[] r0 = r3.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r1 = r3.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                java.lang.System.arraycopy(r4, r5, r0, r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r3.position     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                int r4 = r4 + r6
                r3.position = r4     // Catch: java.lang.IndexOutOfBoundsException -> Ld
                return
            Ld:
                r4 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r5 = new com.google.android.gms.internal.drive.zzjr$zzb
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r3.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 1
                int r2 = r3.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                r1 = 2
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r1] = r6
                java.lang.String r6 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r6 = java.lang.String.format(r6, r0)
                r5.<init>(r6, r4)
                throw r5
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.zzb(r2, r0)
                r1.zzl(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int r2, com.google.android.gms.internal.drive.zzjc r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.zzb(r2, r0)
                r1.zza(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int r4, com.google.android.gms.internal.drive.zzlq r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.zzb(r0, r1)
                r2 = 2
                r3.zzd(r2, r4)
                r3.zzb(r1, r2)
                r3.zzb(r5)
                r4 = 4
                r3.zzb(r0, r4)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        final void zza(int r3, com.google.android.gms.internal.drive.zzlq r4, com.google.android.gms.internal.drive.zzmf r5) throws java.io.IOException {
                r2 = this;
                r0 = 2
                r2.zzb(r3, r0)
                r3 = r4
                com.google.android.gms.internal.drive.zzit r3 = (com.google.android.gms.internal.drive.zzit) r3
                int r0 = r3.zzbm()
                r1 = -1
                if (r0 != r1) goto L15
                int r0 = r5.zzn(r3)
                r3.zzo(r0)
            L15:
                r2.zzy(r0)
                com.google.android.gms.internal.drive.zzjt r3 = r2.zzoh
                r5.zza(r4, r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(int r2, java.lang.String r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                r1.zzb(r2, r0)
                r1.zzl(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zza(com.google.android.gms.internal.drive.zzjc r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.size()
                r1.zzy(r0)
                r2.zza(r1)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjb
        public final void zza(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzaa(int r5) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L27
                byte r3 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L27
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r1 = r2 + 1
                r4.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r3 = r5 >> 8
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L27
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r3 = r5 >> 16
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L27
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r1 = r2 + 1
                r4.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L27
                int r5 = r5 >>> 24
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> L27
                r0[r2] = r5     // Catch: java.lang.IndexOutOfBoundsException -> L27
                return
            L27:
                r5 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r0 = new com.google.android.gms.internal.drive.zzjr$zzb
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int r1, int r2) throws java.io.IOException {
                r0 = this;
                int r1 = r1 << 3
                r1 = r1 | r2
                r0.zzy(r1)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int r4, com.google.android.gms.internal.drive.zzjc r5) throws java.io.IOException {
                r3 = this;
                r0 = 1
                r1 = 3
                r3.zzb(r0, r1)
                r2 = 2
                r3.zzd(r2, r4)
                r3.zza(r1, r5)
                r4 = 4
                r3.zzb(r0, r4)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(int r2, boolean r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.zzb(r2, r0)
                byte r2 = (byte) r3
                r1.zzc(r2)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzb(com.google.android.gms.internal.drive.zzlq r2) throws java.io.IOException {
                r1 = this;
                int r0 = r2.zzcx()
                r1.zzy(r0)
                r2.zzb(r1)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(byte r5) throws java.io.IOException {
                r4 = this;
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lb
                return
            Lb:
                r5 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r0 = new com.google.android.gms.internal.drive.zzjr$zzb
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.zzb(r2, r0)
                r1.zzx(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzc(int r2, long r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                r1.zzb(r2, r0)
                r1.zzn(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final int zzca() {
                r2 = this;
                int r0 = r2.limit
                int r1 = r2.position
                int r0 = r0 - r1
                return r0
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 0
                r1.zzb(r2, r0)
                r1.zzy(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzd(byte[] r1, int r2, int r3) throws java.io.IOException {
                r0 = this;
                r0.zzy(r3)
                r2 = 0
                r0.write(r1, r2, r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzf(int r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 5
                r1.zzb(r2, r0)
                r1.zzaa(r3)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(long r10) throws java.io.IOException {
                r9 = this;
                boolean r0 = com.google.android.gms.internal.drive.zzjr.zzcc()
                r1 = 7
                r2 = 0
                r4 = -128(0xffffffffffffff80, double:NaN)
                if (r0 == 0) goto L3c
                int r0 = r9.zzca()
                r6 = 10
                if (r0 < r6) goto L3c
            L13:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L28
                byte[] r0 = r9.buffer
                int r1 = r9.position
                int r2 = r1 + 1
                r9.position = r2
                long r1 = (long) r1
                int r11 = (int) r10
                byte r10 = (byte) r11
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r10)
                return
            L28:
                byte[] r0 = r9.buffer
                int r6 = r9.position
                int r7 = r6 + 1
                r9.position = r7
                long r6 = (long) r6
                int r8 = (int) r10
                r8 = r8 & 127(0x7f, float:1.78E-43)
                r8 = r8 | 128(0x80, float:1.794E-43)
                byte r8 = (byte) r8
                com.google.android.gms.internal.drive.zznd.zza(r0, r6, r8)
                long r10 = r10 >>> r1
                goto L13
            L3c:
                long r6 = r10 & r4
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 != 0) goto L4f
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r1 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r2 = r1 + 1
                r9.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r11 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                byte r10 = (byte) r11     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r1] = r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                return
            L4f:
                byte[] r0 = r9.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r6 = r9.position     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = r6 + 1
                r9.position = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                int r7 = (int) r10     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r7 = r7 & 127(0x7f, float:1.78E-43)
                r7 = r7 | 128(0x80, float:1.794E-43)
                byte r7 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                r0[r6] = r7     // Catch: java.lang.IndexOutOfBoundsException -> L61
                long r10 = r10 >>> r1
                goto L3c
            L61:
                r10 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r11 = new com.google.android.gms.internal.drive.zzjr$zzb
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r9.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r9.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r11.<init>(r0, r10)
                throw r11
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzl(java.lang.String r6) throws java.io.IOException {
                r5 = this;
                int r0 = r5.position
                int r1 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r1 = r1 * 3
                int r1 = com.google.android.gms.internal.drive.zzjr.zzad(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r2 = r6.length()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r2 = com.google.android.gms.internal.drive.zzjr.zzad(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                if (r2 != r1) goto L2f
                int r1 = r0 + r2
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                byte[] r3 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r4 = r5.zzca()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r1 = com.google.android.gms.internal.drive.zznf.zza(r6, r3, r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                r5.position = r0     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r3 = r1 - r0
                int r3 = r3 - r2
                r5.zzy(r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                return
            L2f:
                int r1 = com.google.android.gms.internal.drive.zznf.zza(r6)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                r5.zzy(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                byte[] r1 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r2 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r3 = r5.zzca()     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                int r1 = com.google.android.gms.internal.drive.zznf.zza(r6, r1, r2, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L45 com.google.android.gms.internal.drive.zznj -> L4c
                return
            L45:
                r6 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r0 = new com.google.android.gms.internal.drive.zzjr$zzb
                r0.<init>(r6)
                throw r0
            L4c:
                r1 = move-exception
                r5.position = r0
                r5.zza(r6, r1)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzn(long r6) throws java.io.IOException {
                r5 = this;
                byte[] r0 = r5.buffer     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r1 = r5.position     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r3 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 8
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 16
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 24
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 32
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 40
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r2] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r2 = r1 + 1
                r5.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r3 = 48
                long r3 = r6 >> r3
                int r4 = (int) r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r3 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r1] = r3     // Catch: java.lang.IndexOutOfBoundsException -> L60
                int r1 = r2 + 1
                r5.position = r1     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r1 = 56
                long r6 = r6 >> r1
                int r7 = (int) r6     // Catch: java.lang.IndexOutOfBoundsException -> L60
                byte r6 = (byte) r7     // Catch: java.lang.IndexOutOfBoundsException -> L60
                r0[r2] = r6     // Catch: java.lang.IndexOutOfBoundsException -> L60
                return
            L60:
                r6 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r7 = new com.google.android.gms.internal.drive.zzjr$zzb
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                int r2 = r5.position
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r1 = r5.limit
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                java.lang.String r1 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r7.<init>(r0, r6)
                throw r7
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzx(int r3) throws java.io.IOException {
                r2 = this;
                if (r3 < 0) goto L6
                r2.zzy(r3)
                return
            L6:
                long r0 = (long) r3
                r2.zzl(r0)
                return
        }

        @Override // com.google.android.gms.internal.drive.zzjr
        public final void zzy(int r5) throws java.io.IOException {
                r4 = this;
                boolean r0 = com.google.android.gms.internal.drive.zzjr.zzcc()
                if (r0 == 0) goto Lad
                boolean r0 = com.google.android.gms.internal.drive.zzix.zzbr()
                if (r0 != 0) goto Lad
                int r0 = r4.zzca()
                r1 = 5
                if (r0 < r1) goto Lad
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L25
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r5)
                return
            L25:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L48
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r5)
                return
            L48:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L6b
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r5)
                return
            L6b:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r3)
                int r5 = r5 >>> 7
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto L8e
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r5)
                return
            L8e:
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                r3 = r5 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r3)
                int r5 = r5 >>> 7
                byte[] r0 = r4.buffer
                int r1 = r4.position
                int r2 = r1 + 1
                r4.position = r2
                long r1 = (long) r1
                byte r5 = (byte) r5
                com.google.android.gms.internal.drive.zznd.zza(r0, r1, r5)
                return
            Lad:
                r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
                if (r0 != 0) goto Lbd
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                byte r5 = (byte) r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r0[r1] = r5     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                return
            Lbd:
                byte[] r0 = r4.buffer     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r1 = r4.position     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r2 = r1 + 1
                r4.position = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r2 = r5 & 127(0x7f, float:1.78E-43)
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                r0[r1] = r2     // Catch: java.lang.IndexOutOfBoundsException -> Lcf
                int r5 = r5 >>> 7
                goto Lad
            Lcf:
                r5 = move-exception
                com.google.android.gms.internal.drive.zzjr$zzb r0 = new com.google.android.gms.internal.drive.zzjr$zzb
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.position
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.limit
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
        }
    }

    public static class zzb extends java.io.IOException {
        zzb() {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0)
                return
        }

        zzb(java.lang.String r3, java.lang.Throwable r4) {
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L11
                java.lang.String r3 = r0.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L16:
                r2.<init>(r3, r4)
                return
        }

        zzb(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
                r1.<init>(r0, r2)
                return
        }
    }

    static {
            java.lang.Class<com.google.android.gms.internal.drive.zzjr> r0 = com.google.android.gms.internal.drive.zzjr.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.gms.internal.drive.zzjr.logger = r0
            boolean r0 = com.google.android.gms.internal.drive.zznd.zzfd()
            com.google.android.gms.internal.drive.zzjr.zzog = r0
            return
    }

    private zzjr() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ zzjr(com.google.android.gms.internal.drive.zzjs r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int zza(int r1, com.google.android.gms.internal.drive.zzkx r2) {
            int r1 = zzab(r1)
            int r2 = r2.zzcx()
            int r0 = zzad(r2)
            int r0 = r0 + r2
            int r1 = r1 + r0
            return r1
    }

    public static int zza(com.google.android.gms.internal.drive.zzkx r1) {
            int r1 = r1.zzcx()
            int r0 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    static int zza(com.google.android.gms.internal.drive.zzlq r2, com.google.android.gms.internal.drive.zzmf r3) {
            com.google.android.gms.internal.drive.zzit r2 = (com.google.android.gms.internal.drive.zzit) r2
            int r0 = r2.zzbm()
            r1 = -1
            if (r0 != r1) goto L10
            int r0 = r3.zzn(r2)
            r2.zzo(r0)
        L10:
            int r2 = zzad(r0)
            int r2 = r2 + r0
            return r2
    }

    public static int zzab(int r0) {
            int r0 = r0 << 3
            int r0 = zzad(r0)
            return r0
    }

    public static int zzac(int r0) {
            if (r0 < 0) goto L7
            int r0 = zzad(r0)
            return r0
        L7:
            r0 = 10
            return r0
    }

    public static int zzad(int r1) {
            r0 = r1 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            r0 = r1 & (-16384(0xffffffffffffc000, float:NaN))
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            r0 = -2097152(0xffffffffffe00000, float:NaN)
            r0 = r0 & r1
            if (r0 != 0) goto L13
            r1 = 3
            return r1
        L13:
            r0 = -268435456(0xfffffffff0000000, float:-1.58456325E29)
            r1 = r1 & r0
            if (r1 != 0) goto L1a
            r1 = 4
            return r1
        L1a:
            r1 = 5
            return r1
    }

    public static int zzae(int r0) {
            int r0 = zzai(r0)
            int r0 = zzad(r0)
            return r0
    }

    public static int zzaf(int r0) {
            r0 = 4
            return r0
    }

    public static int zzag(int r0) {
            r0 = 4
            return r0
    }

    public static int zzah(int r0) {
            int r0 = zzac(r0)
            return r0
    }

    private static int zzai(int r1) {
            int r0 = r1 << 1
            int r1 = r1 >> 31
            r1 = r1 ^ r0
            return r1
    }

    @java.lang.Deprecated
    public static int zzaj(int r0) {
            int r0 = zzad(r0)
            return r0
    }

    public static int zzb(double r0) {
            r0 = 8
            return r0
    }

    public static int zzb(float r0) {
            r0 = 4
            return r0
    }

    public static int zzb(int r0, double r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 8
            return r0
    }

    public static int zzb(int r0, float r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 4
            return r0
    }

    public static int zzb(int r2, com.google.android.gms.internal.drive.zzkx r3) {
            r0 = 1
            int r1 = zzab(r0)
            int r0 = r1 << 1
            r1 = 2
            int r2 = zzh(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = zza(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    public static int zzb(int r2, com.google.android.gms.internal.drive.zzlq r3) {
            r0 = 1
            int r1 = zzab(r0)
            int r0 = r1 << 1
            r1 = 2
            int r2 = zzh(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = zzab(r2)
            int r3 = zzc(r3)
            int r2 = r2 + r3
            int r0 = r0 + r2
            return r0
    }

    static int zzb(int r0, com.google.android.gms.internal.drive.zzlq r1, com.google.android.gms.internal.drive.zzmf r2) {
            int r0 = zzab(r0)
            int r1 = zza(r1, r2)
            int r0 = r0 + r1
            return r0
    }

    public static int zzb(int r0, java.lang.String r1) {
            int r0 = zzab(r0)
            int r1 = zzm(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzb(com.google.android.gms.internal.drive.zzjc r1) {
            int r1 = r1.size()
            int r0 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    public static com.google.android.gms.internal.drive.zzjr zzb(byte[] r3) {
            int r0 = r3.length
            com.google.android.gms.internal.drive.zzjr$zza r1 = new com.google.android.gms.internal.drive.zzjr$zza
            r2 = 0
            r1.<init>(r3, r2, r0)
            return r1
    }

    public static int zzc(int r1, com.google.android.gms.internal.drive.zzjc r2) {
            int r1 = zzab(r1)
            int r2 = r2.size()
            int r0 = zzad(r2)
            int r0 = r0 + r2
            int r1 = r1 + r0
            return r1
    }

    @java.lang.Deprecated
    static int zzc(int r2, com.google.android.gms.internal.drive.zzlq r3, com.google.android.gms.internal.drive.zzmf r4) {
            int r2 = zzab(r2)
            int r2 = r2 << 1
            com.google.android.gms.internal.drive.zzit r3 = (com.google.android.gms.internal.drive.zzit) r3
            int r0 = r3.zzbm()
            r1 = -1
            if (r0 != r1) goto L16
            int r0 = r4.zzn(r3)
            r3.zzo(r0)
        L16:
            int r2 = r2 + r0
            return r2
    }

    public static int zzc(int r0, boolean r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 1
            return r0
    }

    public static int zzc(com.google.android.gms.internal.drive.zzlq r1) {
            int r1 = r1.zzcx()
            int r0 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzc(byte[] r1) {
            int r1 = r1.length
            int r0 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    static /* synthetic */ boolean zzcc() {
            boolean r0 = com.google.android.gms.internal.drive.zzjr.zzog
            return r0
    }

    public static int zzd(int r0, long r1) {
            int r0 = zzab(r0)
            int r1 = zzp(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzd(int r2, com.google.android.gms.internal.drive.zzjc r3) {
            r0 = 1
            int r1 = zzab(r0)
            int r0 = r1 << 1
            r1 = 2
            int r2 = zzh(r1, r2)
            int r0 = r0 + r2
            r2 = 3
            int r2 = zzc(r2, r3)
            int r0 = r0 + r2
            return r0
    }

    @java.lang.Deprecated
    public static int zzd(com.google.android.gms.internal.drive.zzlq r0) {
            int r0 = r0.zzcx()
            return r0
    }

    public static int zzd(boolean r0) {
            r0 = 1
            return r0
    }

    public static int zze(int r0, long r1) {
            int r0 = zzab(r0)
            int r1 = zzp(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzf(int r0, long r1) {
            int r0 = zzab(r0)
            long r1 = zzt(r1)
            int r1 = zzp(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzg(int r0, int r1) {
            int r0 = zzab(r0)
            int r1 = zzac(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzg(int r0, long r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 8
            return r0
    }

    public static int zzh(int r0, int r1) {
            int r0 = zzab(r0)
            int r1 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzh(int r0, long r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 8
            return r0
    }

    public static int zzi(int r0, int r1) {
            int r0 = zzab(r0)
            int r1 = zzai(r1)
            int r1 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzj(int r0, int r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 4
            return r0
    }

    public static int zzk(int r0, int r1) {
            int r0 = zzab(r0)
            int r0 = r0 + 4
            return r0
    }

    public static int zzl(int r0, int r1) {
            int r0 = zzab(r0)
            int r1 = zzac(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzm(java.lang.String r1) {
            int r1 = com.google.android.gms.internal.drive.zznf.zza(r1)     // Catch: com.google.android.gms.internal.drive.zznj -> L5
            goto Lc
        L5:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.drive.zzkm.UTF_8
            byte[] r1 = r1.getBytes(r0)
            int r1 = r1.length
        Lc:
            int r0 = zzad(r1)
            int r0 = r0 + r1
            return r0
    }

    public static int zzo(long r0) {
            int r0 = zzp(r0)
            return r0
    }

    public static int zzp(long r6) {
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            r6 = 1
            return r6
        Lb:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L12
            r6 = 10
            return r6
        L12:
            r0 = -34359738368(0xfffffff800000000, double:NaN)
            long r0 = r0 & r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            r0 = 6
            r1 = 28
            long r6 = r6 >>> r1
            goto L22
        L21:
            r0 = 2
        L22:
            r4 = -2097152(0xffffffffffe00000, double:NaN)
            long r4 = r4 & r6
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L2f
            int r0 = r0 + 2
            r1 = 14
            long r6 = r6 >>> r1
        L2f:
            r4 = -16384(0xffffffffffffc000, double:NaN)
            long r6 = r6 & r4
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L38
            int r0 = r0 + 1
        L38:
            return r0
    }

    public static int zzq(long r0) {
            long r0 = zzt(r0)
            int r0 = zzp(r0)
            return r0
    }

    public static int zzr(long r0) {
            r0 = 8
            return r0
    }

    public static int zzs(long r0) {
            r0 = 8
            return r0
    }

    private static long zzt(long r3) {
            r0 = 1
            long r0 = r3 << r0
            r2 = 63
            long r3 = r3 >> r2
            long r3 = r3 ^ r0
            return r3
    }

    public final void zza(double r1) throws java.io.IOException {
            r0 = this;
            long r1 = java.lang.Double.doubleToRawLongBits(r1)
            r0.zzn(r1)
            return
    }

    public final void zza(float r1) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r0.zzaa(r1)
            return
    }

    public final void zza(int r1, double r2) throws java.io.IOException {
            r0 = this;
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.zzc(r1, r2)
            return
    }

    public final void zza(int r1, float r2) throws java.io.IOException {
            r0 = this;
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.zzf(r1, r2)
            return
    }

    public abstract void zza(int r1, long r2) throws java.io.IOException;

    public abstract void zza(int r1, com.google.android.gms.internal.drive.zzjc r2) throws java.io.IOException;

    public abstract void zza(int r1, com.google.android.gms.internal.drive.zzlq r2) throws java.io.IOException;

    abstract void zza(int r1, com.google.android.gms.internal.drive.zzlq r2, com.google.android.gms.internal.drive.zzmf r3) throws java.io.IOException;

    public abstract void zza(int r1, java.lang.String r2) throws java.io.IOException;

    public abstract void zza(com.google.android.gms.internal.drive.zzjc r1) throws java.io.IOException;

    final void zza(java.lang.String r7, com.google.android.gms.internal.drive.zznj r8) throws java.io.IOException {
            r6 = this;
            java.util.logging.Logger r0 = com.google.android.gms.internal.drive.zzjr.logger
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r2 = "com.google.protobuf.CodedOutputStream"
            java.lang.String r3 = "inefficientWriteStringNoTag"
            java.lang.String r4 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r5 = r8
            r0.logp(r1, r2, r3, r4, r5)
            java.nio.charset.Charset r8 = com.google.android.gms.internal.drive.zzkm.UTF_8
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length     // Catch: com.google.android.gms.internal.drive.zzjr.zzb -> L1e java.lang.IndexOutOfBoundsException -> L20
            r6.zzy(r8)     // Catch: com.google.android.gms.internal.drive.zzjr.zzb -> L1e java.lang.IndexOutOfBoundsException -> L20
            r8 = 0
            int r0 = r7.length     // Catch: com.google.android.gms.internal.drive.zzjr.zzb -> L1e java.lang.IndexOutOfBoundsException -> L20
            r6.zza(r7, r8, r0)     // Catch: com.google.android.gms.internal.drive.zzjr.zzb -> L1e java.lang.IndexOutOfBoundsException -> L20
            return
        L1e:
            r7 = move-exception
            throw r7
        L20:
            r7 = move-exception
            com.google.android.gms.internal.drive.zzjr$zzb r8 = new com.google.android.gms.internal.drive.zzjr$zzb
            r8.<init>(r7)
            throw r8
    }

    public abstract void zzaa(int r1) throws java.io.IOException;

    public abstract void zzb(int r1, int r2) throws java.io.IOException;

    public final void zzb(int r1, long r2) throws java.io.IOException {
            r0 = this;
            long r2 = zzt(r2)
            r0.zza(r1, r2)
            return
    }

    public abstract void zzb(int r1, com.google.android.gms.internal.drive.zzjc r2) throws java.io.IOException;

    public abstract void zzb(int r1, boolean r2) throws java.io.IOException;

    public abstract void zzb(com.google.android.gms.internal.drive.zzlq r1) throws java.io.IOException;

    public abstract void zzc(byte r1) throws java.io.IOException;

    public abstract void zzc(int r1, int r2) throws java.io.IOException;

    public abstract void zzc(int r1, long r2) throws java.io.IOException;

    public final void zzc(boolean r1) throws java.io.IOException {
            r0 = this;
            byte r1 = (byte) r1
            r0.zzc(r1)
            return
    }

    public abstract int zzca();

    public final void zzcb() {
            r2 = this;
            int r0 = r2.zzca()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Did not write as much data as expected."
            r0.<init>(r1)
            throw r0
    }

    public abstract void zzd(int r1, int r2) throws java.io.IOException;

    abstract void zzd(byte[] r1, int r2, int r3) throws java.io.IOException;

    public final void zze(int r1, int r2) throws java.io.IOException {
            r0 = this;
            int r2 = zzai(r2)
            r0.zzd(r1, r2)
            return
    }

    public abstract void zzf(int r1, int r2) throws java.io.IOException;

    public abstract void zzl(long r1) throws java.io.IOException;

    public abstract void zzl(java.lang.String r1) throws java.io.IOException;

    public final void zzm(long r1) throws java.io.IOException {
            r0 = this;
            long r1 = zzt(r1)
            r0.zzl(r1)
            return
    }

    public abstract void zzn(long r1) throws java.io.IOException;

    public abstract void zzx(int r1) throws java.io.IOException;

    public abstract void zzy(int r1) throws java.io.IOException;

    public final void zzz(int r1) throws java.io.IOException {
            r0 = this;
            int r1 = zzai(r1)
            r0.zzy(r1)
            return
    }
}
