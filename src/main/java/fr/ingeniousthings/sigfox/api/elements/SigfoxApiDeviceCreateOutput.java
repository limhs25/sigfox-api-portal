package fr.ingeniousthings.sigfox.api.elements;

/*
{
  "total": 25
  "jobId" : "5256c4d6c9a871b80f5a2e50",
  "transferFailed" : ["AC10", "00C1",...]
}
 */

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SigfoxApiDeviceCreateOutput {

    @ApiModelProperty(
            notes = "Total number of devices pushed in the request. ",
            required = true
    )
    protected int total;

    @ApiModelProperty(
            notes = "The job's object id that could be use to check devices creation status (only if a job is effectively created) ( use POST https://backend.sigfox.com/api/devicetypes/{deviceTypeId}/registration/{jobId} ). ",
            required = true
    )
    protected String jobId;

    @ApiModelProperty(
            notes = "List of device identifiers for which the PAC was invalid, or whose ownership transfer was rejected.",
            required = true
    )
    protected List<String> transferFailed;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public List<String> getTransferFailed() {
        return transferFailed;
    }

    public void setTransferFailed(List<String> transferFailed) {
        this.transferFailed = transferFailed;
    }
}
