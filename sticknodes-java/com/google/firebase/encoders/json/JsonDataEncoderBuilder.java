package com.google.firebase.encoders.json;

/* loaded from: classes2.dex */
public final class JsonDataEncoderBuilder implements com.google.firebase.encoders.config.EncoderConfig<com.google.firebase.encoders.json.JsonDataEncoderBuilder> {
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> BOOLEAN_ENCODER = null;
    private static final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> DEFAULT_FALLBACK_ENCODER = null;
    private static final com.google.firebase.encoders.ValueEncoder<java.lang.String> STRING_ENCODER = null;
    private static final com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder TIMESTAMP_ENCODER = null;
    private com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private boolean ignoreNullValues;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;


    private static final class TimestampEncoder implements com.google.firebase.encoders.ValueEncoder<java.util.Date> {
        private static final java.text.DateFormat rfc339 = null;

        static {
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.util.Locale r1 = java.util.Locale.US
                java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
                r0.<init>(r2, r1)
                com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder.rfc339 = r0
                java.lang.String r1 = "UTC"
                java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
                r0.setTimeZone(r1)
                return
        }

        private TimestampEncoder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ TimestampEncoder(com.google.firebase.encoders.json.JsonDataEncoderBuilder.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public /* bridge */ /* synthetic */ void encode(java.lang.Object r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Date r1 = (java.util.Date) r1
                com.google.firebase.encoders.ValueEncoderContext r2 = (com.google.firebase.encoders.ValueEncoderContext) r2
                r0.encode(r1, r2)
                return
        }

        public void encode(java.util.Date r2, com.google.firebase.encoders.ValueEncoderContext r3) throws java.io.IOException {
                r1 = this;
                java.text.DateFormat r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.TimestampEncoder.rfc339
                java.lang.String r2 = r0.format(r2)
                r3.add(r2)
                return
        }
    }

    /* renamed from: $r8$lambda$-wizuO7QDz2oZvwPaVDIhV6kjIg, reason: not valid java name */
    public static /* synthetic */ void m61$r8$lambda$wizuO7QDz2oZvwPaVDIhV6kjIg(java.lang.Object r0, com.google.firebase.encoders.ObjectEncoderContext r1) {
            lambda$static$0(r0, r1)
            return
    }

    /* renamed from: $r8$lambda$Z1mE2zUFv0phA0vAqntDz-GAArE, reason: not valid java name */
    public static /* synthetic */ void m62$r8$lambda$Z1mE2zUFv0phA0vAqntDzGAArE(java.lang.String r0, com.google.firebase.encoders.ValueEncoderContext r1) {
            lambda$static$1(r0, r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$xmm0MvvU8mhfGehtFk1GE8aNT6Y(java.lang.Boolean r0, com.google.firebase.encoders.ValueEncoderContext r1) {
            lambda$static$2(r0, r1)
            return
    }

    static {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0 r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0.INSTANCE
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.DEFAULT_FALLBACK_ENCODER = r0
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda2 r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda2.INSTANCE
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.STRING_ENCODER = r0
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda1 r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda1.INSTANCE
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.BOOLEAN_ENCODER = r0
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder
            r1 = 0
            r0.<init>(r1)
            com.google.firebase.encoders.json.JsonDataEncoderBuilder.TIMESTAMP_ENCODER = r0
            return
    }

    public JsonDataEncoderBuilder() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.objectEncoders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.valueEncoders = r0
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.DEFAULT_FALLBACK_ENCODER
            r2.fallbackEncoder = r0
            r0 = 0
            r2.ignoreNullValues = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.google.firebase.encoders.ValueEncoder<java.lang.String> r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.STRING_ENCODER
            r2.registerEncoder(r0, r1)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            com.google.firebase.encoders.ValueEncoder<java.lang.Boolean> r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.BOOLEAN_ENCODER
            r2.registerEncoder(r0, r1)
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$TimestampEncoder r1 = com.google.firebase.encoders.json.JsonDataEncoderBuilder.TIMESTAMP_ENCODER
            r2.registerEncoder(r0, r1)
            return
    }

    static /* synthetic */ java.util.Map access$100(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r0.objectEncoders
            return r0
    }

    static /* synthetic */ java.util.Map access$200(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r0.valueEncoders
            return r0
    }

    static /* synthetic */ com.google.firebase.encoders.ObjectEncoder access$300(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = r0.fallbackEncoder
            return r0
    }

    static /* synthetic */ boolean access$400(com.google.firebase.encoders.json.JsonDataEncoderBuilder r0) {
            boolean r0 = r0.ignoreNullValues
            return r0
    }

    private static /* synthetic */ void lambda$static$0(java.lang.Object r2, com.google.firebase.encoders.ObjectEncoderContext r3) throws java.io.IOException {
            com.google.firebase.encoders.EncodingException r3 = new com.google.firebase.encoders.EncodingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't find encoder for type "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
    }

    private static /* synthetic */ void lambda$static$1(java.lang.String r0, com.google.firebase.encoders.ValueEncoderContext r1) throws java.io.IOException {
            r1.add(r0)
            return
    }

    private static /* synthetic */ void lambda$static$2(java.lang.Boolean r0, com.google.firebase.encoders.ValueEncoderContext r1) throws java.io.IOException {
            boolean r0 = r0.booleanValue()
            r1.add(r0)
            return
    }

    public com.google.firebase.encoders.DataEncoder build() {
            r1 = this;
            com.google.firebase.encoders.json.JsonDataEncoderBuilder$1 r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder$1
            r0.<init>(r1)
            return r0
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder configureWith(com.google.firebase.encoders.config.Configurator r1) {
            r0 = this;
            r1.configure(r0)
            return r0
    }

    public com.google.firebase.encoders.json.JsonDataEncoderBuilder ignoreNullValues(boolean r1) {
            r0 = this;
            r0.ignoreNullValues = r1
            return r0
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.config.EncoderConfig registerEncoder(java.lang.Class r1, com.google.firebase.encoders.ObjectEncoder r2) {
            r0 = this;
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r1 = r0.registerEncoder(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> r2, com.google.firebase.encoders.ObjectEncoder<? super T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r1.objectEncoders
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r3 = r1.valueEncoders
            r3.remove(r2)
            return r1
    }

    public <T> com.google.firebase.encoders.json.JsonDataEncoderBuilder registerEncoder(java.lang.Class<T> r2, com.google.firebase.encoders.ValueEncoder<? super T> r3) {
            r1 = this;
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r1.valueEncoders
            r0.put(r2, r3)
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r3 = r1.objectEncoders
            r3.remove(r2)
            return r1
    }
}
