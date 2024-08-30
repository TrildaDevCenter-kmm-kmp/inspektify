package sp.bvantur.inspektify.ktor.utils.extensions

import sp.bvantur.inspektify.NetworkTrafficData
import sp.bvantur.inspektify.ktor.data.model.NetworkTraffic

internal fun NetworkTrafficData.toNetworkTraffic(): NetworkTraffic = NetworkTraffic(
    id = id,
    method = method,
    url = url,
    host = host,
    path = path,
    protocol = protocol,
    requestTimestamp = requestTimestamp,
    requestHeaders = requestHeaders,
    requestPayload = requestPayload,
    requestPayloadSize = requestPayloadSize,
    requestHeadersSize = requestHeadersSize,
    responseTimestamp = responseTimestamp,
    responseStatus = responseStatus?.toInt(),
    responseStatusDescription = responseStatusDescription,
    responseHeaders = responseHeaders,
    responsePayload = responsePayload,
    responsePayloadSize = responsePayloadSize?.toInt(),
    responseHeadersSize = responseHeadersSize?.toInt(),
    tookDurationInMs = tookDurationInMs,
)
