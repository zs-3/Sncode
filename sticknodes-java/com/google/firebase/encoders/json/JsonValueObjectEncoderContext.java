package com.google.firebase.encoders.json;

/* loaded from: classes2.dex */
final class JsonValueObjectEncoderContext implements com.google.firebase.encoders.ObjectEncoderContext, com.google.firebase.encoders.ValueEncoderContext {
    private boolean active;
    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext childContext;
    private final com.google.firebase.encoders.ObjectEncoder<java.lang.Object> fallbackEncoder;
    private final boolean ignoreNullValues;
    private final android.util.JsonWriter jsonWriter;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> objectEncoders;
    private final java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> valueEncoders;

    JsonValueObjectEncoderContext(java.io.Writer r2, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r3, java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r4, com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r5, boolean r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.childContext = r0
            r0 = 1
            r1.active = r0
            android.util.JsonWriter r0 = new android.util.JsonWriter
            r0.<init>(r2)
            r1.jsonWriter = r0
            r1.objectEncoders = r3
            r1.valueEncoders = r4
            r1.fallbackEncoder = r5
            r1.ignoreNullValues = r6
            return
    }

    private boolean cannotBeInline(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L1f
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.util.Date
            if (r0 != 0) goto L1f
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L1f
            boolean r2 = r2 instanceof java.lang.Number
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
    }

    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext internalAdd(java.lang.String r2, java.lang.Object r3) throws java.io.IOException, com.google.firebase.encoders.EncodingException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            if (r3 != 0) goto L10
            android.util.JsonWriter r2 = r1.jsonWriter
            r2.nullValue()
            return r1
        L10:
            r2 = 0
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3, r2)
            return r2
    }

    private com.google.firebase.encoders.json.JsonValueObjectEncoderContext internalAddIgnoreNullValues(java.lang.String r2, java.lang.Object r3) throws java.io.IOException, com.google.firebase.encoders.EncodingException {
            r1 = this;
            if (r3 != 0) goto L3
            return r1
        L3:
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            r2 = 0
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3, r2)
            return r2
    }

    private void maybeUnNest() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.active
            if (r0 == 0) goto L19
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r0 = r2.childContext
            if (r0 == 0) goto L18
            r0.maybeUnNest()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r0 = r2.childContext
            r1 = 0
            r0.active = r1
            r0 = 0
            r2.childContext = r0
            android.util.JsonWriter r0 = r2.jsonWriter
            r0.endObject()
        L18:
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Parent context used since this context was created. Cannot use this context anymore."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, double r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getName()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, int r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getName()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, long r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getName()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, java.lang.Object r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getName()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public com.google.firebase.encoders.ObjectEncoderContext add(com.google.firebase.encoders.FieldDescriptor r1, boolean r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getName()
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1, r2)
            return r1
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.ValueEncoderContext add(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1)
            return r1
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public /* bridge */ /* synthetic */ com.google.firebase.encoders.ValueEncoderContext add(boolean r1) throws java.io.IOException {
            r0 = this;
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r1 = r0.add(r1)
            return r1
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(double r2) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.value(r2)
            return r1
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(int r4) throws java.io.IOException {
            r3 = this;
            r3.maybeUnNest()
            android.util.JsonWriter r0 = r3.jsonWriter
            long r1 = (long) r4
            r0.value(r1)
            return r3
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(long r2) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.value(r2)
            return r1
    }

    com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.Object r6, boolean r7) throws java.io.IOException {
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L22
            boolean r2 = r5.cannotBeInline(r6)
            if (r2 == 0) goto L22
            com.google.firebase.encoders.EncodingException r7 = new com.google.firebase.encoders.EncodingException
            java.lang.Object[] r0 = new java.lang.Object[r0]
            if (r6 != 0) goto L12
            r6 = 0
            goto L16
        L12:
            java.lang.Class r6 = r6.getClass()
        L16:
            r0[r1] = r6
            java.lang.String r6 = "%s cannot be encoded inline"
            java.lang.String r6 = java.lang.String.format(r6, r0)
            r7.<init>(r6)
            throw r7
        L22:
            if (r6 != 0) goto L2a
            android.util.JsonWriter r6 = r5.jsonWriter
            r6.nullValue()
            return r5
        L2a:
            boolean r2 = r6 instanceof java.lang.Number
            if (r2 == 0) goto L36
            android.util.JsonWriter r7 = r5.jsonWriter
            java.lang.Number r6 = (java.lang.Number) r6
            r7.value(r6)
            return r5
        L36:
            java.lang.Class r2 = r6.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto Lc1
            boolean r7 = r6 instanceof byte[]
            if (r7 == 0) goto L4b
            byte[] r6 = (byte[]) r6
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r6 = r5.add(r6)
            return r6
        L4b:
            android.util.JsonWriter r7 = r5.jsonWriter
            r7.beginArray()
            boolean r7 = r6 instanceof int[]
            if (r7 == 0) goto L64
            int[] r6 = (int[]) r6
            int r7 = r6.length
        L57:
            if (r1 >= r7) goto Lbb
            r0 = r6[r1]
            android.util.JsonWriter r2 = r5.jsonWriter
            long r3 = (long) r0
            r2.value(r3)
            int r1 = r1 + 1
            goto L57
        L64:
            boolean r7 = r6 instanceof long[]
            if (r7 == 0) goto L75
            long[] r6 = (long[]) r6
            int r7 = r6.length
        L6b:
            if (r1 >= r7) goto Lbb
            r2 = r6[r1]
            r5.add(r2)
            int r1 = r1 + 1
            goto L6b
        L75:
            boolean r7 = r6 instanceof double[]
            if (r7 == 0) goto L88
            double[] r6 = (double[]) r6
            int r7 = r6.length
        L7c:
            if (r1 >= r7) goto Lbb
            r2 = r6[r1]
            android.util.JsonWriter r0 = r5.jsonWriter
            r0.value(r2)
            int r1 = r1 + 1
            goto L7c
        L88:
            boolean r7 = r6 instanceof boolean[]
            if (r7 == 0) goto L9b
            boolean[] r6 = (boolean[]) r6
            int r7 = r6.length
        L8f:
            if (r1 >= r7) goto Lbb
            boolean r0 = r6[r1]
            android.util.JsonWriter r2 = r5.jsonWriter
            r2.value(r0)
            int r1 = r1 + 1
            goto L8f
        L9b:
            boolean r7 = r6 instanceof java.lang.Number[]
            if (r7 == 0) goto Lad
            java.lang.Number[] r6 = (java.lang.Number[]) r6
            int r7 = r6.length
            r0 = 0
        La3:
            if (r0 >= r7) goto Lbb
            r2 = r6[r0]
            r5.add(r2, r1)
            int r0 = r0 + 1
            goto La3
        Lad:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r6.length
            r0 = 0
        Lb1:
            if (r0 >= r7) goto Lbb
            r2 = r6[r0]
            r5.add(r2, r1)
            int r0 = r0 + 1
            goto Lb1
        Lbb:
            android.util.JsonWriter r6 = r5.jsonWriter
            r6.endArray()
            return r5
        Lc1:
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto Le4
            java.util.Collection r6 = (java.util.Collection) r6
            android.util.JsonWriter r7 = r5.jsonWriter
            r7.beginArray()
            java.util.Iterator r6 = r6.iterator()
        Ld0:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lde
            java.lang.Object r7 = r6.next()
            r5.add(r7, r1)
            goto Ld0
        Lde:
            android.util.JsonWriter r6 = r5.jsonWriter
            r6.endArray()
            return r5
        Le4:
            boolean r2 = r6 instanceof java.util.Map
            if (r2 == 0) goto L130
            java.util.Map r6 = (java.util.Map) r6
            android.util.JsonWriter r7 = r5.jsonWriter
            r7.beginObject()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lf7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L12a
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r2 = r7.getKey()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassCastException -> L112
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.ClassCastException -> L112
            r5.add(r3, r7)     // Catch: java.lang.ClassCastException -> L112
            goto Lf7
        L112:
            r6 = move-exception
            com.google.firebase.encoders.EncodingException r7 = new com.google.firebase.encoders.EncodingException
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r2
            java.lang.Class r1 = r2.getClass()
            r3[r0] = r1
            java.lang.String r0 = "Only String keys are currently supported in maps, got %s of type %s instead."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r7.<init>(r0, r6)
            throw r7
        L12a:
            android.util.JsonWriter r6 = r5.jsonWriter
            r6.endObject()
            return r5
        L130:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r5.objectEncoders
            java.lang.Class r1 = r6.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto L143
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r6 = r5.doEncode(r0, r6, r7)
            return r6
        L143:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ValueEncoder<?>> r0 = r5.valueEncoders
            java.lang.Class r1 = r6.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ValueEncoder r0 = (com.google.firebase.encoders.ValueEncoder) r0
            if (r0 == 0) goto L155
            r0.encode(r6, r5)
            return r5
        L155:
            boolean r0 = r6 instanceof java.lang.Enum
            if (r0 == 0) goto L171
            boolean r7 = r6 instanceof com.google.firebase.encoders.json.NumberedEnum
            if (r7 == 0) goto L167
            com.google.firebase.encoders.json.NumberedEnum r6 = (com.google.firebase.encoders.json.NumberedEnum) r6
            int r6 = r6.getNumber()
            r5.add(r6)
            goto L170
        L167:
            java.lang.Enum r6 = (java.lang.Enum) r6
            java.lang.String r6 = r6.name()
            r5.add(r6)
        L170:
            return r5
        L171:
            com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r0 = r5.fallbackEncoder
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r6 = r5.doEncode(r0, r6, r7)
            return r6
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.value(r2)
            return r1
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2, double r3) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3)
            return r2
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2, int r3) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3)
            return r2
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2, long r3) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3)
            return r2
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.ignoreNullValues
            if (r0 == 0) goto L9
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.internalAddIgnoreNullValues(r2, r3)
            return r2
        L9:
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.internalAdd(r2, r3)
            return r2
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(java.lang.String r2, boolean r3) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.name(r2)
            com.google.firebase.encoders.json.JsonValueObjectEncoderContext r2 = r1.add(r3)
            return r2
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(boolean r2) throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.value(r2)
            return r1
    }

    public com.google.firebase.encoders.json.JsonValueObjectEncoderContext add(byte[] r3) throws java.io.IOException {
            r2 = this;
            r2.maybeUnNest()
            if (r3 != 0) goto Lb
            android.util.JsonWriter r3 = r2.jsonWriter
            r3.nullValue()
            goto L15
        Lb:
            android.util.JsonWriter r0 = r2.jsonWriter
            r1 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r1)
            r0.value(r3)
        L15:
            return r2
    }

    void close() throws java.io.IOException {
            r1 = this;
            r1.maybeUnNest()
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.flush()
            return
    }

    com.google.firebase.encoders.json.JsonValueObjectEncoderContext doEncode(com.google.firebase.encoders.ObjectEncoder<java.lang.Object> r2, java.lang.Object r3, boolean r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L7
            android.util.JsonWriter r0 = r1.jsonWriter
            r0.beginObject()
        L7:
            r2.encode(r3, r1)
            if (r4 != 0) goto L11
            android.util.JsonWriter r2 = r1.jsonWriter
            r2.endObject()
        L11:
            return r1
    }
}
