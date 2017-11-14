package stock;

import bean.Reader;
import utility.ArrayWorker;
import utility.Checker;
import bean.Request;

public class RequestStock {

    private Request[] requests = new Request[50];
    private Reader[] readers = new Reader[50];


    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }

    public Reader[] getReaders() {
        return readers;
    }

    public void setReaders(Reader[] readers) {
        this.readers = readers;
    }

    public void addRequest(Request request){
        if (Checker.getPosition(requests) == -1) {
            requests = ArrayWorker.extendArray(requests);
        }
        int position = Checker.getPosition(requests);
        requests [position] = request;
    }

    public void addReader(Reader reader){
        if (Checker.getPosition(readers) == -1) {
            readers = ArrayWorker.extendArray(readers);
        }
        int position = Checker.getPosition(readers);
        readers [position] = reader;
    }
}
