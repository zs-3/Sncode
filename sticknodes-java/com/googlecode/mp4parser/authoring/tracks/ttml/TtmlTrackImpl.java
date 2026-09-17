package com.googlecode.mp4parser.authoring.tracks.ttml;

/* loaded from: classes2.dex */
public class TtmlTrackImpl extends com.googlecode.mp4parser.authoring.AbstractTrack {
    com.coremedia.iso.boxes.SampleDescriptionBox sampleDescriptionBox;
    private long[] sampleDurations;
    java.util.List<com.googlecode.mp4parser.authoring.Sample> samples;
    com.coremedia.iso.boxes.SubSampleInformationBox subSampleInformationBox;
    com.googlecode.mp4parser.authoring.TrackMetaData trackMetaData;
    com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry xmlSubtitleSampleEntry;


    public TtmlTrackImpl(java.lang.String r10, java.util.List<org.w3c.dom.Document> r11) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException, javax.xml.xpath.XPathExpressionException, java.net.URISyntaxException {
            r9 = this;
            r9.<init>(r10)
            com.googlecode.mp4parser.authoring.TrackMetaData r10 = new com.googlecode.mp4parser.authoring.TrackMetaData
            r10.<init>()
            r9.trackMetaData = r10
            com.coremedia.iso.boxes.SampleDescriptionBox r10 = new com.coremedia.iso.boxes.SampleDescriptionBox
            r10.<init>()
            r9.sampleDescriptionBox = r10
            com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry r10 = new com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry
            r10.<init>()
            r9.xmlSubtitleSampleEntry = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.samples = r10
            com.coremedia.iso.boxes.SubSampleInformationBox r10 = new com.coremedia.iso.boxes.SubSampleInformationBox
            r10.<init>()
            r9.subSampleInformationBox = r10
            r9.extractLanguage(r11)
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            int r0 = r11.size()
            long[] r0 = new long[r0]
            r9.sampleDurations = r0
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            javax.xml.namespace.NamespaceContext r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT
            r0.setNamespaceContext(r1)
            r0 = 0
            r1 = 0
        L45:
            int r2 = r11.size()
            if (r1 < r2) goto L98
            com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry r1 = r9.xmlSubtitleSampleEntry
            java.lang.Object r11 = r11.get(r0)
            org.w3c.dom.Document r11 = (org.w3c.dom.Document) r11
            java.lang.String[] r11 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getAllNamespaces(r11)
            java.lang.String r0 = ","
            java.lang.String r11 = join(r0, r11)
            r1.setNamespace(r11)
            com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry r11 = r9.xmlSubtitleSampleEntry
            java.lang.String r1 = ""
            r11.setSchemaLocation(r1)
            com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry r11 = r9.xmlSubtitleSampleEntry
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r10)
            int r10 = r10.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            java.lang.Object[] r10 = r1.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.String r10 = join(r0, r10)
            r11.setAuxiliaryMimeTypes(r10)
            com.coremedia.iso.boxes.SampleDescriptionBox r10 = r9.sampleDescriptionBox
            com.mp4parser.iso14496.part30.XMLSubtitleSampleEntry r11 = r9.xmlSubtitleSampleEntry
            r10.addBox(r11)
            com.googlecode.mp4parser.authoring.TrackMetaData r10 = r9.trackMetaData
            r0 = 30000(0x7530, double:1.4822E-319)
            r10.setTimescale(r0)
            com.googlecode.mp4parser.authoring.TrackMetaData r10 = r9.trackMetaData
            r11 = 65535(0xffff, float:9.1834E-41)
            r10.setLayer(r11)
            return
        L98:
            java.lang.Object r2 = r11.get(r1)
            org.w3c.dom.Document r2 = (org.w3c.dom.Document) r2
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry r3 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry
            r3.<init>()
            com.coremedia.iso.boxes.SubSampleInformationBox r4 = r9.subSampleInformationBox
            java.util.List r4 = r4.getEntries()
            r4.add(r3)
            r4 = 1
            r3.setSampleDelta(r4)
            long[] r4 = r9.sampleDurations
            long r5 = r9.extractDuration(r2)
            r4[r1] = r5
            java.util.List r4 = extractImages(r2)
            java.util.List r5 = r9.extractMimeTypes(r2)
            r10.addAll(r5)
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            r6 = 4
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.pretty(r2, r5, r6)
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry r2 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry
            r2.<init>()
            int r6 = r5.size()
            long r6 = (long) r6
            r2.setSubsampleSize(r6)
            java.util.List r6 = r3.getSubsampleEntries()
            r6.add(r2)
            java.util.Iterator r2 = r4.iterator()
        Le5:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto Lfd
            byte[] r2 = r5.toByteArray()
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r3 = r9.samples
            com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl$1 r4 = new com.googlecode.mp4parser.authoring.tracks.ttml.TtmlTrackImpl$1
            r4.<init>(r9, r2)
            r3.add(r4)
            int r1 = r1 + 1
            goto L45
        Lfd:
            java.lang.Object r4 = r2.next()
            byte[] r4 = (byte[]) r4
            r5.write(r4)
            com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry r6 = new com.coremedia.iso.boxes.SubSampleInformationBox$SubSampleEntry$SubsampleEntry
            r6.<init>()
            int r4 = r4.length
            long r7 = (long) r4
            r6.setSubsampleSize(r7)
            java.util.List r4 = r3.getSubsampleEntries()
            r4.add(r6)
            goto Le5
    }

    protected static java.util.List<byte[]> extractImages(org.w3c.dom.Document r9) throws javax.xml.xpath.XPathExpressionException, java.net.URISyntaxException, java.io.IOException {
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            java.lang.String r1 = "//*/@backgroundImage"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET
            java.lang.Object r0 = r0.evaluate(r9, r1)
            org.w3c.dom.NodeList r0 = (org.w3c.dom.NodeList) r0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = 1
            r3 = 0
        L1d:
            int r4 = r0.getLength()
            if (r3 < r4) goto L67
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L66
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L36:
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L3d
            goto L66
        L3d:
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.net.URI r3 = new java.net.URI
            java.lang.String r4 = r9.getDocumentURI()
            r3.<init>(r4)
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.net.URI r2 = r3.resolve(r2)
            java.net.URL r2 = r2.toURL()
            java.io.InputStream r2 = r2.openStream()
            byte[] r2 = streamToByteArray(r2)
            r0.add(r2)
            goto L36
        L66:
            return r0
        L67:
            org.w3c.dom.Node r4 = r0.item(r3)
            java.lang.String r5 = r4.getNodeValue()
            java.lang.String r6 = "."
            int r6 = r5.lastIndexOf(r6)
            java.lang.String r6 = r5.substring(r6)
            java.lang.Object r7 = r1.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "urn:mp4parser:"
            r7.<init>(r8)
            int r8 = r2 + 1
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            r1.put(r7, r5)
            r2 = r8
        L98:
            r4.setNodeValue(r7)
            int r3 = r3 + 1
            goto L1d
    }

    public static java.lang.String getLanguage(org.w3c.dom.Document r1) {
            org.w3c.dom.Element r1 = r1.getDocumentElement()
            java.lang.String r0 = "xml:lang"
            java.lang.String r1 = r1.getAttribute(r0)
            return r1
    }

    private static java.lang.String join(java.lang.String r4, java.lang.String[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 < r1) goto L17
            int r4 = r0.length()
            int r4 = r4 + (-1)
            r0.setLength(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L17:
            r3 = r5[r2]
            r0.append(r3)
            r0.append(r4)
            int r2 = r2 + 1
            goto L7
    }

    private static long latestTimestamp(org.w3c.dom.Document r5) {
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            javax.xml.namespace.NamespaceContext r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT
            r0.setNamespaceContext(r1)
            java.lang.String r1 = "//*[name()='p']"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            java.lang.Object r5 = r0.evaluate(r5, r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            org.w3c.dom.NodeList r5 = (org.w3c.dom.NodeList) r5     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            r0 = 0
            r2 = 0
        L1e:
            int r3 = r5.getLength()     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            if (r2 < r3) goto L25
            return r0
        L25:
            org.w3c.dom.Node r3 = r5.item(r2)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getEndTime(r3)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            long r0 = java.lang.Math.max(r3, r0)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            int r2 = r2 + 1
            goto L1e
        L34:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }

    private static byte[] streamToByteArray(java.io.InputStream r4) throws java.io.IOException {
            r0 = 8096(0x1fa0, float:1.1345E-41)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
        L9:
            r2 = -1
            int r3 = r4.read(r0)
            if (r2 != r3) goto L15
            byte[] r4 = r1.toByteArray()
            return r4
        L15:
            r2 = 0
            r1.write(r0, r2, r3)
            goto L9
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    long extractDuration(org.w3c.dom.Document r5) {
            r4 = this;
            long r0 = r4.lastTimestamp(r5)
            long r2 = r4.firstTimestamp(r5)
            long r0 = r0 - r2
            return r0
    }

    protected void extractLanguage(java.util.List<org.w3c.dom.Document> r4) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L5:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto Lc
            return
        Lc:
            java.lang.Object r1 = r4.next()
            org.w3c.dom.Document r1 = (org.w3c.dom.Document) r1
            java.lang.String r1 = getLanguage(r1)
            if (r0 != 0) goto L27
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r3.trackMetaData
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r1)
            java.lang.String r2 = r2.getISO3Language()
            r0.setLanguage(r2)
            r0 = r1
            goto L5
        L27:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2e
            goto L5
        L2e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Within one Track all sample documents need to have the same language"
            r4.<init>(r0)
            throw r4
    }

    protected java.util.List<java.lang.String> extractMimeTypes(org.w3c.dom.Document r5) throws javax.xml.xpath.XPathExpressionException {
            r4 = this;
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            java.lang.String r1 = "//*/@smpte:backgroundImage"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET
            java.lang.Object r5 = r0.evaluate(r5, r1)
            org.w3c.dom.NodeList r5 = (org.w3c.dom.NodeList) r5
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1 = 0
        L1c:
            int r2 = r5.getLength()
            if (r1 < r2) goto L28
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            return r5
        L28:
            org.w3c.dom.Node r2 = r5.item(r1)
            java.lang.String r2 = r2.getNodeValue()
            java.lang.String r3 = "."
            int r3 = r2.lastIndexOf(r3)
            java.lang.String r2 = r2.substring(r3)
            java.lang.String r3 = "jpg"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L59
            java.lang.String r3 = "jpeg"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L4b
            goto L59
        L4b:
            java.lang.String r3 = "png"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L5e
            java.lang.String r2 = "image/png"
            r0.add(r2)
            goto L5e
        L59:
            java.lang.String r2 = "image/jpeg"
            r0.add(r2)
        L5e:
            int r1 = r1 + 1
            goto L1c
    }

    protected long firstTimestamp(org.w3c.dom.Document r6) {
            r5 = this;
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            javax.xml.namespace.NamespaceContext r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT
            r0.setNamespaceContext(r1)
            java.lang.String r1 = "//*[@begin]"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            java.lang.Object r6 = r0.evaluate(r6, r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            org.w3c.dom.NodeList r6 = (org.w3c.dom.NodeList) r6     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
        L21:
            int r3 = r6.getLength()     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            if (r2 < r3) goto L28
            return r0
        L28:
            org.w3c.dom.Node r3 = r6.item(r2)     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getStartTime(r3)     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            long r0 = java.lang.Math.min(r3, r0)     // Catch: javax.xml.xpath.XPathExpressionException -> L37
            int r2 = r2 + 1
            goto L21
        L37:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.lang.String getHandler() {
            r1 = this;
            java.lang.String r0 = "subt"
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SampleDescriptionBox getSampleDescriptionBox() {
            r1 = this;
            com.coremedia.iso.boxes.SampleDescriptionBox r0 = r1.sampleDescriptionBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public long[] getSampleDurations() {
            r8 = this;
            long[] r0 = r8.sampleDurations
            int r0 = r0.length
            long[] r1 = new long[r0]
            r2 = 0
        L6:
            if (r2 < r0) goto L9
            return r1
        L9:
            long[] r3 = r8.sampleDurations
            r4 = r3[r2]
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r8.trackMetaData
            long r6 = r3.getTimescale()
            long r4 = r4 * r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            r1[r2] = r4
            int r2 = r2 + 1
            goto L6
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public java.util.List<com.googlecode.mp4parser.authoring.Sample> getSamples() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Sample> r0 = r1.samples
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.AbstractTrack, com.googlecode.mp4parser.authoring.Track
    public com.coremedia.iso.boxes.SubSampleInformationBox getSubsampleInformationBox() {
            r1 = this;
            com.coremedia.iso.boxes.SubSampleInformationBox r0 = r1.subSampleInformationBox
            return r0
    }

    @Override // com.googlecode.mp4parser.authoring.Track
    public com.googlecode.mp4parser.authoring.TrackMetaData getTrackMetaData() {
            r1 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r1.trackMetaData
            return r0
    }

    protected long lastTimestamp(org.w3c.dom.Document r6) {
            r5 = this;
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            javax.xml.namespace.NamespaceContext r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT
            r0.setNamespaceContext(r1)
            java.lang.String r1 = "//*[@end]"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            java.lang.Object r6 = r0.evaluate(r6, r1)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            org.w3c.dom.NodeList r6 = (org.w3c.dom.NodeList) r6     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            r0 = 0
            r2 = 0
        L1e:
            int r3 = r6.getLength()     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            if (r2 < r3) goto L25
            return r0
        L25:
            org.w3c.dom.Node r3 = r6.item(r2)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getEndTime(r3)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            long r0 = java.lang.Math.max(r3, r0)     // Catch: javax.xml.xpath.XPathExpressionException -> L34
            int r2 = r2 + 1
            goto L1e
        L34:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            throw r0
    }
}
