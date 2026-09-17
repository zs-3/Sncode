package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum RSAAlgorithm extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.RSAAlgorithm> implements com.google.android.gms.fido.fido2.api.common.Algorithm {

    @java.lang.Deprecated
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm LEGACY_RS1 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS256 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS384 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm PS512 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS1 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS256 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS384 = null;
    public static final com.google.android.gms.fido.fido2.api.common.RSAAlgorithm RS512 = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] zza = null;
    private final int zzb;

    static {
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r0 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r1 = "RS256"
            r2 = 0
            r3 = -257(0xfffffffffffffeff, float:NaN)
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS256 = r0
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r1 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r3 = "RS384"
            r4 = 1
            r5 = -258(0xfffffffffffffefe, float:NaN)
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS384 = r1
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r3 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r5 = "RS512"
            r6 = 2
            r7 = -259(0xfffffffffffffefd, float:NaN)
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS512 = r3
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r5 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r7 = "LEGACY_RS1"
            r8 = 3
            r9 = -262(0xfffffffffffffefa, float:NaN)
            r5.<init>(r7, r8, r9)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.LEGACY_RS1 = r5
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r7 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r9 = "PS256"
            r10 = 4
            r11 = -37
            r7.<init>(r9, r10, r11)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS256 = r7
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r9 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r11 = "PS384"
            r12 = 5
            r13 = -38
            r9.<init>(r11, r12, r13)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS384 = r9
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r11 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r13 = "PS512"
            r14 = 6
            r15 = -39
            r11.<init>(r13, r14, r15)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.PS512 = r11
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r13 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm
            java.lang.String r15 = "RS1"
            r14 = 7
            r12 = -65535(0xffffffffffff0001, float:NaN)
            r13.<init>(r15, r14, r12)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS1 = r13
            r12 = 8
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] r12 = new com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[r12]
            r12[r2] = r0
            r12[r4] = r1
            r12[r6] = r3
            r12[r8] = r5
            r12[r10] = r7
            r0 = 5
            r12[r0] = r9
            r0 = 6
            r12[r0] = r11
            r12[r14] = r13
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.zza = r12
            return
    }

    RSAAlgorithm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.RSAAlgorithm valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.RSAAlgorithm> r0 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r1 = (com.google.android.gms.fido.fido2.api.common.RSAAlgorithm) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] values() {
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] r0 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] r0 = (com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[]) r0
            return r0
    }

    @Override // com.google.android.gms.fido.fido2.api.common.Algorithm
    public int getAlgoValue() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }
}
