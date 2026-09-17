package com.google.android.gms.common.server.response;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FieldCreator")
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zaj CREATOR = null;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final java.lang.String zae;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;
        protected final java.lang.Class zag;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final java.lang.String zah;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private com.google.android.gms.common.server.response.zan zaj;

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zak;

        static {
                com.google.android.gms.common.server.response.zaj r0 = new com.google.android.gms.common.server.response.zaj
                r0.<init>()
                com.google.android.gms.common.server.response.FastJsonResponse.Field.CREATOR = r0
                return
        }

        @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
        Field(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) int r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa r9) {
                r0 = this;
                r0.<init>()
                r0.zai = r1
                r0.zaa = r2
                r0.zab = r3
                r0.zac = r4
                r0.zad = r5
                r0.zae = r6
                r0.zaf = r7
                r1 = 0
                if (r8 != 0) goto L19
                r0.zag = r1
                r0.zah = r1
                goto L1f
            L19:
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r2 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                r0.zag = r2
                r0.zah = r8
            L1f:
                if (r9 != 0) goto L24
                r0.zak = r1
                return
            L24:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r9.zab()
                r0.zak = r1
                return
        }

        protected Field(int r2, boolean r3, int r4, boolean r5, java.lang.String r6, int r7, java.lang.Class r8, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter r9) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.zai = r0
                r1.zaa = r2
                r1.zab = r3
                r1.zac = r4
                r1.zad = r5
                r1.zae = r6
                r1.zaf = r7
                r1.zag = r8
                if (r8 != 0) goto L1a
                r2 = 0
                r1.zah = r2
                goto L20
            L1a:
                java.lang.String r2 = r8.getCanonicalName()
                r1.zah = r2
            L20:
                r1.zak = r9
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 8
                r2 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 6
                r2 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(java.lang.String r10, int r11, java.lang.Class<T> r12) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 11
                r2 = 0
                r4 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(java.lang.String r10, int r11, java.lang.Class<T> r12) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 11
                r2 = 1
                r4 = 1
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 4
                r2 = 0
                r3 = 4
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 3
                r2 = 0
                r3 = 3
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r1 = 2
                r2 = 0
                r3 = 2
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 7
                r2 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 10
                r2 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(java.lang.String r10, int r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r3 = 7
                r2 = 1
                r4 = 1
                r7 = 0
                r8 = 0
                r0 = r9
                r1 = r3
                r5 = r10
                r6 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(java.lang.String r10, int r11, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> r12, boolean r13) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r9 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r12.zaa()
                r12.zab()
                r1 = 7
                r3 = 0
                r4 = 0
                r7 = 0
                r0 = r9
                r2 = r13
                r5 = r10
                r6 = r11
                r8 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zac(com.google.android.gms.common.server.response.FastJsonResponse.Field r0) {
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r0.zak
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public int getSafeParcelableFieldId() {
                r1 = this;
                int r0 = r1.zaf
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
                int r1 = r3.zai
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "versionCode"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zaa
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "typeIn"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zab
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r2 = "typeInArray"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zac
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "typeOut"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zad
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                java.lang.String r2 = "typeOutArray"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.zae
                java.lang.String r2 = "outputFieldName"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zaf
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.String r2 = "safeParcelFieldId"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = r3.zag()
                java.lang.String r2 = "concreteTypeName"
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.Class r1 = r3.zag
                if (r1 == 0) goto L6b
                java.lang.String r1 = r1.getCanonicalName()
                java.lang.String r2 = "concreteType.class"
                r0.add(r2, r1)
            L6b:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r3.zak
                if (r1 == 0) goto L7c
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getCanonicalName()
                java.lang.String r2 = "converterName"
                r0.add(r2, r1)
            L7c:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r5, int r6) {
                r4 = this;
                int r0 = r4.zai
                int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
                r2 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
                int r0 = r4.zaa
                r2 = 2
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
                boolean r0 = r4.zab
                r2 = 3
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r0)
                int r0 = r4.zac
                r2 = 4
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
                boolean r0 = r4.zad
                r2 = 5
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r2, r0)
                java.lang.String r0 = r4.zae
                r2 = 6
                r3 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
                int r0 = r4.getSafeParcelableFieldId()
                r2 = 7
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
                java.lang.String r0 = r4.zag()
                r2 = 8
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
                com.google.android.gms.common.server.converter.zaa r0 = r4.zaa()
                r2 = 9
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
                return
        }

        final com.google.android.gms.common.server.converter.zaa zaa() {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                com.google.android.gms.common.server.converter.zaa r0 = com.google.android.gms.common.server.converter.zaa.zaa(r0)
                return r0
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse.Field zab() {
                r11 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$Field r10 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                int r1 = r11.zai
                int r2 = r11.zaa
                boolean r3 = r11.zab
                int r4 = r11.zac
                boolean r5 = r11.zad
                java.lang.String r6 = r11.zae
                int r7 = r11.zaf
                java.lang.String r8 = r11.zah
                com.google.android.gms.common.server.converter.zaa r9 = r11.zaa()
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse zad() throws java.lang.InstantiationException, java.lang.IllegalAccessException {
                r3 = this;
                java.lang.Class r0 = r3.zag
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.lang.Class r0 = r3.zag
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r1 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                if (r0 != r1) goto L21
                java.lang.String r0 = r3.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r3.zaj
                java.lang.String r1 = "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object."
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.server.response.SafeParcelResponse r0 = new com.google.android.gms.common.server.response.SafeParcelResponse
                com.google.android.gms.common.server.response.zan r1 = r3.zaj
                java.lang.String r2 = r3.zah
                r0.<init>(r1, r2)
                return r0
            L21:
                java.lang.Object r0 = r0.newInstance()
                com.google.android.gms.common.server.response.FastJsonResponse r0 = (com.google.android.gms.common.server.response.FastJsonResponse) r0
                return r0
        }

        public final java.lang.Object zae(java.lang.Object r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                java.lang.Object r2 = r0.zac(r2)
                java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
                return r2
        }

        public final java.lang.Object zaf(java.lang.Object r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                java.lang.Object r2 = r0.zad(r2)
                return r2
        }

        final java.lang.String zag() {
                r1 = this;
                java.lang.String r0 = r1.zah
                if (r0 != 0) goto L5
                r0 = 0
            L5:
                return r0
        }

        public final java.util.Map zah() {
                r2 = this;
                java.lang.String r0 = r2.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r2.zaj
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r2.zaj
                java.lang.String r1 = r2.zah
                java.util.Map r0 = r0.zab(r1)
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.util.Map r0 = (java.util.Map) r0
                return r0
        }

        public final void zai(com.google.android.gms.common.server.response.zan r1) {
                r0 = this;
                r0.zaj = r1
                return
        }

        public final boolean zaj() {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @com.google.android.gms.common.internal.ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        java.lang.Object zac(java.lang.Object r1);

        java.lang.Object zad(java.lang.Object r1);
    }

    public FastJsonResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static final java.lang.Object zaD(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.Object r2) {
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r1)
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.zaf(r2)
            return r1
        Lb:
            return r2
    }

    private final void zaE(com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r5.zac
            java.lang.Object r6 = r5.zae(r6)
            java.lang.String r1 = r5.zae
            switch(r0) {
                case 0: goto L70;
                case 1: goto L6a;
                case 2: goto L5a;
                case 3: goto Lb;
                case 4: goto L4a;
                case 5: goto L44;
                case 6: goto L34;
                case 7: goto L2e;
                case 8: goto L22;
                case 9: goto L22;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unsupported type for conversion: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L22:
            if (r6 == 0) goto L2a
            byte[] r6 = (byte[]) r6
            r4.setDecodedBytesInternal(r5, r1, r6)
            return
        L2a:
            zaG(r1)
            return
        L2e:
            java.lang.String r6 = (java.lang.String) r6
            r4.setStringInternal(r5, r1, r6)
            return
        L34:
            if (r6 == 0) goto L40
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.setBooleanInternal(r5, r1, r6)
            return
        L40:
            zaG(r1)
            return
        L44:
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            r4.zab(r5, r1, r6)
            return
        L4a:
            if (r6 == 0) goto L56
            java.lang.Double r6 = (java.lang.Double) r6
            double r2 = r6.doubleValue()
            r4.zan(r5, r1, r2)
            return
        L56:
            zaG(r1)
            return
        L5a:
            if (r6 == 0) goto L66
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            r4.setLongInternal(r5, r1, r2)
            return
        L66:
            zaG(r1)
            return
        L6a:
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            r4.zaf(r5, r1, r6)
            return
        L70:
            if (r6 == 0) goto L7c
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setIntegerInternal(r5, r1, r6)
            return
        L7c:
            zaG(r1)
            return
    }

    private static final void zaF(java.lang.StringBuilder r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3, java.lang.Object r4) {
            int r0 = r3.zaa
            r1 = 11
            if (r0 == r1) goto L1f
            r3 = 7
            if (r0 != r3) goto L1b
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r2.append(r4)
            r2.append(r3)
            return
        L1b:
            r2.append(r4)
            return
        L1f:
            java.lang.Class r3 = r3.zag
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r3 = r3.cast(r4)
            com.google.android.gms.common.server.response.FastJsonResponse r3 = (com.google.android.gms.common.server.response.FastJsonResponse) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            return
    }

    private static final void zaG(java.lang.String r3) {
            java.lang.String r0 = "FastJsonResponse"
            r1 = 6
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Output field ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") has a null value, but expected a primitive"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.util.Log.e(r0, r3)
        L22:
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList<T> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Concrete type array not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, T r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Concrete type not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    @com.google.android.gms.common.annotation.KeepForSdk
    protected java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field r6) {
            r5 = this;
            java.lang.String r0 = r6.zae
            java.lang.Class r1 = r6.zag
            if (r1 == 0) goto L54
            java.lang.Object r1 = r5.getValueObject(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r6 = r6.zae
            r4[r3] = r6
            java.lang.String r6 = "Concrete field shouldn't be value object: %s"
            com.google.android.gms.common.internal.Preconditions.checkState(r1, r6, r4)
            char r6 = r0.charAt(r3)     // Catch: java.lang.Exception -> L4d
            char r6 = java.lang.Character.toUpperCase(r6)     // Catch: java.lang.Exception -> L4d
            java.lang.String r0 = r0.substring(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4d
            r1.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "get"
            r1.append(r2)     // Catch: java.lang.Exception -> L4d
            r1.append(r6)     // Catch: java.lang.Exception -> L4d
            r1.append(r0)     // Catch: java.lang.Exception -> L4d
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L4d
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Exception -> L4d
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r6 = r0.getMethod(r6, r1)     // Catch: java.lang.Exception -> L4d
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L4d
            java.lang.Object r6 = r6.invoke(r5, r0)     // Catch: java.lang.Exception -> L4d
            return r6
        L4d:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
        L54:
            java.lang.Object r6 = r5.getValueObject(r0)
            return r6
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract java.lang.Object getValueObject(java.lang.String r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r2 = this;
            int r0 = r3.zac
            r1 = 11
            if (r0 != r1) goto L1a
            boolean r3 = r3.zad
            if (r3 == 0) goto L12
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Concrete type arrays not supported"
            r3.<init>(r0)
            throw r3
        L12:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Concrete types not supported"
            r3.<init>(r0)
            throw r3
        L1a:
            java.lang.String r3 = r3.zae
            boolean r3 = r2.isPrimitiveFieldSet(r3)
            return r3
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract boolean isPrimitiveFieldSet(java.lang.String r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Boolean not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "byte[] not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Integer not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, long r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Long not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String map not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "String list not supported"
            r1.<init>(r2)
            throw r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.lang.String toString() {
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L13
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = zaD(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L41
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L44
        L41:
            r1.append(r7)
        L44:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L59
            java.lang.String r3 = "null"
            r1.append(r3)
            goto L13
        L59:
            int r3 = r4.zac
            switch(r3) {
                case 8: goto L85;
                case 9: goto L75;
                case 10: goto L6f;
                default: goto L5e;
            }
        L5e:
            boolean r3 = r4.zab
            if (r3 == 0) goto Lb0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
            goto L96
        L6f:
            java.util.HashMap r5 = (java.util.HashMap) r5
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r5)
            goto L13
        L75:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        L85:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        L96:
            if (r6 >= r3) goto La9
            if (r6 <= 0) goto L9d
            r1.append(r7)
        L9d:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto La6
            zaF(r1, r4, r8)
        La6:
            int r6 = r6 + 1
            goto L96
        La9:
            java.lang.String r3 = "]"
            r1.append(r3)
            goto L13
        Lb0:
            zaF(r1, r4, r5)
            goto L13
        Lb5:
            int r0 = r1.length()
            if (r0 <= 0) goto Lc1
            java.lang.String r0 = "}"
            r1.append(r0)
            goto Lc6
        Lc1:
            java.lang.String r0 = "{}"
            r1.append(r0)
        Lc6:
            java.lang.String r0 = r1.toString()
            return r0
    }

    public final void zaA(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringInternal(r2, r0, r3)
            return
    }

    public final void zaB(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringMapInternal(r2, r0, r3)
            return
    }

    public final void zaC(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringsInternal(r2, r0, r3)
            return
    }

    public final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.math.BigDecimal r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zab(r2, r0, r3)
            return
    }

    protected void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigDecimal r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigDecimal not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zad(r2, r0, r3)
            return
    }

    protected void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigDecimal list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.math.BigInteger r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaf(r2, r0, r3)
            return
    }

    protected void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigInteger r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigInteger not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zah(r2, r0, r3)
            return
    }

    protected void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "BigInteger list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zai(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, boolean r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setBooleanInternal(r2, r0, r3)
            return
    }

    public final void zaj(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zak(r2, r0, r3)
            return
    }

    protected void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Boolean list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, byte[] r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setDecodedBytesInternal(r2, r0, r3)
            return
    }

    public final void zam(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, double r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.zan(r2, r0, r3)
            return
    }

    protected void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, double r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Double not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zao(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zap(r2, r0, r3)
            return
    }

    protected void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Double list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zaq(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, float r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.zar(r2, r0, r3)
            return
    }

    protected void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, float r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Float not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zas(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zat(r2, r0, r3)
            return
    }

    protected void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Float list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zau(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, int r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setIntegerInternal(r2, r0, r3)
            return
    }

    public final void zav(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaw(r2, r0, r3)
            return
    }

    protected void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Integer list not supported"
            r1.<init>(r2)
            throw r1
    }

    public final void zax(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, long r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setLongInternal(r2, r0, r3)
            return
    }

    public final void zay(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaz(r2, r0, r3)
            return
    }

    protected void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Long list not supported"
            r1.<init>(r2)
            throw r1
    }
}
