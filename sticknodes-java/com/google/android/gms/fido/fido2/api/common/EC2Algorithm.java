package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum EC2Algorithm extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.EC2Algorithm> implements com.google.android.gms.fido.fido2.api.common.Algorithm {
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED25519 = null;
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED256 = null;
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ED512 = null;
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES256 = null;
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES384 = null;
    public static final com.google.android.gms.fido.fido2.api.common.EC2Algorithm ES512 = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] zza = null;
    private final int zzb;

    static {
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r0 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r1 = "ED256"
            r2 = 0
            r3 = -260(0xfffffffffffffefc, float:NaN)
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED256 = r0
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r1 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r3 = "ED512"
            r4 = 1
            r5 = -261(0xfffffffffffffefb, float:NaN)
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED512 = r1
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r3 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r5 = "ED25519"
            r6 = 2
            r7 = -8
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ED25519 = r3
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r5 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r7 = "ES256"
            r8 = 3
            r9 = -7
            r5.<init>(r7, r8, r9)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES256 = r5
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r7 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r9 = "ES384"
            r10 = 4
            r11 = -35
            r7.<init>(r9, r10, r11)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES384 = r7
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r9 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm
            java.lang.String r11 = "ES512"
            r12 = 5
            r13 = -36
            r9.<init>(r11, r12, r13)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.ES512 = r9
            r11 = 6
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] r11 = new com.google.android.gms.fido.fido2.api.common.EC2Algorithm[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm.zza = r11
            return
    }

    EC2Algorithm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.EC2Algorithm valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.EC2Algorithm> r0 = com.google.android.gms.fido.fido2.api.common.EC2Algorithm.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm r1 = (com.google.android.gms.fido.fido2.api.common.EC2Algorithm) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] values() {
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] r0 = com.google.android.gms.fido.fido2.api.common.EC2Algorithm.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] r0 = (com.google.android.gms.fido.fido2.api.common.EC2Algorithm[]) r0
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
