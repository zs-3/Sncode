package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticationExtensions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final com.google.android.gms.fido.fido2.api.common.zzs zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final com.google.android.gms.fido.fido2.api.common.zzz zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final com.google.android.gms.fido.fido2.api.common.zzab zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final com.google.android.gms.fido.fido2.api.common.zzad zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final com.google.android.gms.fido.fido2.api.common.zzu zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final com.google.android.gms.fido.fido2.api.common.zzag zzh;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPrfExtension", id = 11)
    private final com.google.android.gms.fido.fido2.api.common.zzai zzj;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
        private com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzb;
        private com.google.android.gms.fido.fido2.api.common.zzs zzc;
        private com.google.android.gms.fido.fido2.api.common.zzz zzd;
        private com.google.android.gms.fido.fido2.api.common.zzab zze;
        private com.google.android.gms.fido.fido2.api.common.zzad zzf;
        private com.google.android.gms.fido.fido2.api.common.zzu zzg;
        private com.google.android.gms.fido.fido2.api.common.zzag zzh;
        private com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
        private com.google.android.gms.fido.fido2.api.common.zzai zzj;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L41
                com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r0 = r2.getFidoAppIdExtension()
                r1.zza = r0
                com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r0 = r2.getUserVerificationMethodExtension()
                r1.zzb = r0
                com.google.android.gms.fido.fido2.api.common.zzs r0 = r2.zza()
                r1.zzc = r0
                com.google.android.gms.fido.fido2.api.common.zzz r0 = r2.zzc()
                r1.zzd = r0
                com.google.android.gms.fido.fido2.api.common.zzab r0 = r2.zzd()
                r1.zze = r0
                com.google.android.gms.fido.fido2.api.common.zzad r0 = r2.zze()
                r1.zzf = r0
                com.google.android.gms.fido.fido2.api.common.zzu r0 = r2.zzb()
                r1.zzg = r0
                com.google.android.gms.fido.fido2.api.common.zzag r0 = r2.zzg()
                r1.zzh = r0
                com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r0 = r2.zzf()
                r1.zzi = r0
                com.google.android.gms.fido.fido2.api.common.zzai r2 = r2.zzh()
                r1.zzj = r2
            L41:
                return
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions build() {
                r12 = this;
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r11 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
                com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r1 = r12.zza
                com.google.android.gms.fido.fido2.api.common.zzs r2 = r12.zzc
                com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r3 = r12.zzb
                com.google.android.gms.fido.fido2.api.common.zzz r4 = r12.zzd
                com.google.android.gms.fido.fido2.api.common.zzab r5 = r12.zze
                com.google.android.gms.fido.fido2.api.common.zzad r6 = r12.zzf
                com.google.android.gms.fido.fido2.api.common.zzu r7 = r12.zzg
                com.google.android.gms.fido.fido2.api.common.zzag r8 = r12.zzh
                com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r9 = r12.zzi
                com.google.android.gms.fido.fido2.api.common.zzai r10 = r12.zzj
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setFido2Extension(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setGoogleThirdPartyPaymentExtension(com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r1) {
                r0 = this;
                r0.zzi = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setUserVerificationMethodExtension(com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzd r0 = new com.google.android.gms.fido.fido2.api.common.zzd
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthenticationExtensions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.fido.fido2.api.common.zzs r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.fido.fido2.api.common.zzz r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.fido.fido2.api.common.zzab r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.fido.fido2.api.common.zzad r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) com.google.android.gms.fido.fido2.api.common.zzu r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.fido.fido2.api.common.zzag r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) com.google.android.gms.fido.fido2.api.common.zzai r10) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r3
            r0.zzb = r2
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            r0.zzh = r8
            r0.zzi = r9
            r0.zzj = r10
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r4 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) r4
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzs r0 = r3.zzb
            com.google.android.gms.fido.fido2.api.common.zzs r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r0 = r3.zzc
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzz r0 = r3.zzd
            com.google.android.gms.fido.fido2.api.common.zzz r2 = r4.zzd
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzab r0 = r3.zze
            com.google.android.gms.fido.fido2.api.common.zzab r2 = r4.zze
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzad r0 = r3.zzf
            com.google.android.gms.fido.fido2.api.common.zzad r2 = r4.zzf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzu r0 = r3.zzg
            com.google.android.gms.fido.fido2.api.common.zzu r2 = r4.zzg
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzag r0 = r3.zzh
            com.google.android.gms.fido.fido2.api.common.zzag r2 = r4.zzh
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r0 = r3.zzi
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r2 = r4.zzi
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L6e
            com.google.android.gms.fido.fido2.api.common.zzai r0 = r3.zzj
            com.google.android.gms.fido.fido2.api.common.zzai r4 = r4.zzj
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L6e
            r4 = 1
            return r4
        L6e:
            return r1
    }

    public com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension getFidoAppIdExtension() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r0 = r1.zza
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension getUserVerificationMethodExtension() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r0 = r1.zzc
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzs r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzz r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzab r1 = r3.zze
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzad r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzu r1 = r3.zzg
            r2 = 6
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzag r1 = r3.zzh
            r2 = 7
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r1 = r3.zzi
            r2 = 8
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzai r1 = r3.zzj
            r2 = 9
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r1 = r4.getFidoAppIdExtension()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzs r1 = r4.zzb
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r1 = r4.getUserVerificationMethodExtension()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzz r1 = r4.zzd
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzab r1 = r4.zze
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzad r1 = r4.zzf
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzu r1 = r4.zzg
            r2 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzag r1 = r4.zzh
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r1 = r4.zzi
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzai r1 = r4.zzj
            r2 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.fido.fido2.api.common.zzs zza() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzs r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzu zzb() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzu r0 = r1.zzg
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzz zzc() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzz r0 = r1.zzd
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzab zzd() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzab r0 = r1.zze
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzad zze() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzad r0 = r1.zzf
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzf() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r0 = r1.zzi
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzag zzg() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzag r0 = r1.zzh
            return r0
    }

    public final com.google.android.gms.fido.fido2.api.common.zzai zzh() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.zzai r0 = r1.zzj
            return r0
    }
}
